import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask

/*
 * Copyright (C) 2001-2002  Zaval Creative Engineering Group (http://www.zaval.org)
 * Copyright (C) 2018-2023 Christoph Obexer <cobexer@gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * (version 2) as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

plugins {
	application
	alias(libs.plugins.spotless)
	alias(libs.plugins.javacc)
	alias(libs.plugins.sonarqube)
	alias(libs.plugins.versions)
}

application {
	mainClass = "org.zaval.tools.i18n.translator.JrcEditor"
	executableDir = ""
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

tasks.withType<JavaCompile> {
	options.encoding = "UTF-8"
}

spotless {
	java {
		target("src/**/*.java")
		licenseHeaderFile(rootProject.file("resources/license.java"))
		eclipse().configFile(rootProject.file("resources/eclipse-jdt-formatter.xml"))
		removeUnusedImports()
		trimTrailingWhitespace()
		endWithNewline()
	}
}

dependencies {
	implementation(libs.commons.configuration)
	implementation(libs.commons.beanutils)
	implementation(libs.jakarta.regexp)
}

repositories {
	mavenLocal()
	mavenCentral()
}

sourceSets {
	main {
		java {
			srcDir(tasks.compileJavacc.map { it.outputDirectory })
		}
	}
}

tasks.withType(GenerateEclipseClasspath::class).configureEach {
	dependsOn("compileJavacc")
}

tasks.compileJavacc {
	inputDirectory = file("src/main/javacc")
	outputDirectory = project.layout.buildDirectory.dir("generated/javacc").get().asFile
}

tasks.withType(Tar::class).configureEach {
	compression = Compression.GZIP
}

tasks.assemble.configure {
	dependsOn(":spotlessCheck")
}

sonarqube {
	properties {
		property("sonar.exclusions", "**/org/zaval/tools/i18n/translator/generated/**")
		property("sonar.branch.name", System.getenv("TRAVIS_BRANCH"))
	}
}

tasks.withType(DependencyUpdatesTask::class.java).configureEach {
	resolutionStrategy {
		componentSelection {
			all {
				var rejected = listOf("alpha", "beta", "rc", "cr", "m").any { qualifier ->
					val regex = Regex("(?i).*[.-]${qualifier}[.\\d-]*")
					regex.containsMatchIn(candidate.version)
				}
				if (rejected) {
					reject("Release candidate")
				}
				else {
					rejected = candidate.version.contains("-");
					if (rejected) {
						reject("SNAPSHOT version")
					}
				}
			}
		}
	}
}
