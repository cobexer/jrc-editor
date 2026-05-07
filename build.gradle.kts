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
	application
	id("buildlogic.java")
	id("buildlogic.root")
}

tasks.check {
	dependsOn(tasks.withType(ProjectHealthTask::class.java))
}

application {
	mainClass = "org.zaval.tools.i18n.translator.JrcEditor"
	mainModule = "jrc.editor.main"
	executableDir = ""
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

tasks.assemble.configure {
	dependsOn(":spotlessCheck")
}

sonarqube {
	properties {
		property("sonar.exclusions", "**/org/zaval/tools/i18n/translator/generated/**")
		property("sonar.branch.name", System.getenv("TRAVIS_BRANCH"))
	}
}

tasks.withType<DependencyUpdatesTask> {
	rejectVersionIf {
		listOf("alpha", "beta", "rc", "cr", "m").any { qualifier ->
			Regex("(?i).*[.-]${qualifier}[.\\d-]*").containsMatchIn(candidate.version)
		} || candidate.version.contains("-")
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
