import com.autonomousapps.tasks.ProjectHealthTask
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
	alias(libs.plugins.dependency.analysis)
	alias(libs.plugins.beryx.jlink)
	alias(libs.plugins.spotless)
	alias(libs.plugins.javacc)
	alias(libs.plugins.sonarqube)
	alias(libs.plugins.versions)
}

dependencyAnalysis {
	issues {
		all {
			onDuplicateClassWarnings {
				severity("fail")
			}
		}
	}
}

tasks.check {
	dependsOn(tasks.withType(ProjectHealthTask::class.java))
}

application {
	mainClass = "org.zaval.tools.i18n.translator.JrcEditor"
	mainModule = "jrc.editor.main"
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
	implementation(libs.slf4j.api)

	runtimeOnly(libs.bundles.slf4j.runtime)
	runtimeOnly(libs.commons.beanutils)
}

repositories {
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

jlink {
	options = listOf("--strip-debug", "--compress", "2", "--no-header-files", "--no-man-pages")
	launcher {
		name = "jrc-editor"
	}
	jpackage {
		icon = "resources/jrc-editor.icns"
	}
}
