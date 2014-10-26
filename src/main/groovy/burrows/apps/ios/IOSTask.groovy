package burrows.apps.ios

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class IOSTask extends DefaultTask {
    String greeting = 'hello from GreetingTask'

    @TaskAction
    def greet() {
        println greeting
    }
}
