package burrows.apps.ios.extensions.innner

import org.gradle.api.Project

/**
 * DefaultConfig Extension allowing user's to specify Xcode settings for their iOS application.
 *
 * <p>
 *     Example "defaultConfig" extension:
 * </p>
 *
 * <pre>
 *       // XCode Settings
 *       defaultConfig {
 *           minSdkVersion '6.1'     // Minimum iOS SDK version
 *           targetSdkVersion '8.1'  // Target iOS SDK version
 *           versionCode 1           // *optional*
 *           versionName '1.0'       // *optional*
 *       }
 * </pre>
 *
 * @author <a href='mailto:jaredsburrows@gmail.com'>Jared Burrows</a>
 * @since 0.0.1
 */
class DefaultConfig {
    Project project
    def minSdkVersion, targetSdkVersion, versionCode, versionName

    DefaultConfig(Project project) {
        this.project = project
    }
}
