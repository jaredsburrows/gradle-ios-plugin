package burrows.apps.ios.extensions

import org.gradle.api.Project

/**
 * iOS Extension forms the block below. The {@link IOSExtension} will contain all other extensions
 * as well as both the <b>compileSdkVersion</b> and <b>buildToolsVersion</b> XCode settings.
 *
 * <p>
 *     Example "build.gradle":
 * </p>
 *
 * <pre>
 *    ios {
 *       // iOS Settings
 *       compileSdkVersion '8.1'     // iOS SDK version
 *       buildToolsVersion '6.1'     // XCode version
 *
 *       // XCode Settings
 *       defaultConfig {
 *           minSdkVersion '6.1'     // Minimum iOS SDK version
 *           targetSdkVersion '8.1'  // Target iOS SDK version
 *           versionCode 1           // *optional*
 *           versionName '1.0'       // *optional*
 *       }
 *
 *       // Cocoa Pods
 *       cocoaPods {
 *           pod 'Google-Mobile-Ads-SDK'
 *           pod 'GoogleAnalytics-iOS-SDK'
 *       }
 *   }
 * </pre>
 *
 * @see burrows.apps.ios.extensions.innner.DefaultConfig
 * @see burrows.apps.ios.extensions.innner.CocoaPods
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 * @since 0.0.1
 */
class IOSExtension {
    Project project
    def compileSdkVersion, buildToolsVersion

    IOSExtension(Project project) {
        this.project = project
    }
}
