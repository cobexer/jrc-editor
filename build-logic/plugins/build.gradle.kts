plugins {
	`kotlin-dsl`
}

dependencies {
	implementation(plugin(libs.plugins.dependency.analysis))
	implementation(plugin(libs.plugins.beryx.jlink))
	implementation(plugin(libs.plugins.spotless))
	implementation(plugin(libs.plugins.javacc))
	implementation(plugin(libs.plugins.sonarqube))
	implementation(plugin(libs.plugins.versions))
}

// Helper function that transforms a Gradle Plugin alias from a
// Version Catalog into a valid dependency notation for buildSrc
fun DependencyHandlerScope.plugin(plugin: Provider<PluginDependency>) =
	plugin.map { "${it.pluginId}:${it.pluginId}.gradle.plugin:${it.version}" }
