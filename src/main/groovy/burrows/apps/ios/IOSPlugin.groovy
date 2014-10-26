package burrows.apps.ios

import org.gradle.api.Plugin
import org.gradle.api.Project

class IOSPlugin implements Plugin<Project> {

    @Override
    void apply(Project target) {
        target.task('hello', type: IOSTask)
    }
}
