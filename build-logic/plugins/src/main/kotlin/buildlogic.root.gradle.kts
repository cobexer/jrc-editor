import com.autonomousapps.DependencyAnalysisExtension
import org.gradle.kotlin.dsl.configure

plugins {
	id("com.autonomousapps.dependency-analysis")
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
