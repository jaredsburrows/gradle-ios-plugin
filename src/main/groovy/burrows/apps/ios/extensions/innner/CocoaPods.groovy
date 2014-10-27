package burrows.apps.ios.extensions.innner
import org.gradle.api.Project

/**
 * CocoaPods Extension allowing user's to list their dependencies. Listed dependencies will be added
 * to the 'Podfile' used by CocoaPods.
 *
 * Please see the the http://cocoapods.org/ official website.
 *
 * <p>
 *     Example "cocoaPods" extension:
 * </p>
 *
 * <pre>
 *       // Cocoa Pods
 *       cocoaPods {
 *           pod 'Google-Mobile-Ads-SDK'
 *           pod 'GoogleAnalytics-iOS-SDK'
 *       }
 * </pre>
 *
 * @author <a href='mailto:jaredsburrows@gmail.com'>Jared Burrows</a>
 * @since 0.0.1
 */
class CocoaPods {
    Project project
    def pods = []

    CocoaPods(Project project) {
        this.project = project
    }

    def pod(String pod) {
        pods.add(pod)
    }
}
