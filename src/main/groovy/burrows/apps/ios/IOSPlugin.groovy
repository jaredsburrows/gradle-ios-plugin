package burrows.apps.ios

import burrows.apps.ios.extensions.IOSExtension
import burrows.apps.ios.extensions.innner.CocoaPods
import burrows.apps.ios.extensions.innner.DefaultConfig
import burrows.apps.ios.tasks.PrintTask
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Creates the iOS Gradle Plugin.
 *
 * @author <a href='mailto:jaredsburrows@gmail.com'>Jared Burrows</a>
 * @since 0.0.1
 */
class IOSPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        /* Make sure we have these repos */
        project.repositories.add(project.repositories.jcenter())
        project.repositories.add(project.repositories.mavenCentral())

        /* Create and install the extension object */
        project.extensions.create('ios', IOSExtension, project)
        project.ios.extensions.create('defaultConfig', DefaultConfig, project)
        project.ios.extensions.create('cocoaPods', CocoaPods, project)

        /* Add tasks */
        project.task('printConfig', type: PrintTask)
    }

    def static getGradleVersion(Project project) {
        Integer.valueOf(project.getGradle().getGradleVersion())
    }

    def static getGroovyVersion() {
        Double.valueOf(GroovySystem.getVersion())
    }
}
