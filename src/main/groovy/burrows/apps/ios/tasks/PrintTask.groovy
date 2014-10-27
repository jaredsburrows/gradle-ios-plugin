package burrows.apps.ios.tasks

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * Print the current configuration.
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 * @since 0.0.1
 */
class PrintTask extends DefaultTask {

    def PrintTask() {
        group = 'iOS Plugin'
        description = 'Prints current iOS configuration.'
    }

    @TaskAction
    def print() {
        println "compileSdkVersion = " + project.ios.compileSdkVersion
        println "buildToolsVersion = " + project.ios.buildToolsVersion

        println "defaultConfig.minSdkVersion = " + project.ios.defaultConfig.minSdkVersion
        println "defaultConfig.targetSdkVersion = " + project.ios.defaultConfig.targetSdkVersion
        println "defaultConfig.versionCode = " + project.ios.defaultConfig.versionCode
        println "defaultConfig.versionName = " + project.ios.defaultConfig.versionName

        println "cocoaPods.pods = " + project.ios.cocoaPods.pods
    }
}
