plugins {
	id("org.beryx.jlink")
	id("com.diffplug.spotless")
	id("ca.coglinc2.javacc")
	id("org.sonarqube")
	id("com.github.ben-manes.versions")
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

tasks.withType<JavaCompile> {
	options.encoding = "UTF-8"
}

repositories {
	mavenCentral()
}

tasks.withType<Tar>().configureEach {
	compression = Compression.GZIP
}
