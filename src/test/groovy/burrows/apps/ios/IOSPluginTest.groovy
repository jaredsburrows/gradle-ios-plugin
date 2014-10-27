package burrows.apps.ios

import burrows.apps.ios.tasks.PrintTask
import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test

import static org.junit.Assert.assertTrue

class IOSPluginTest {

    @Test
    public void pluginInstanceTaskPlugin() {
        Project project = ProjectBuilder.builder().build()
        project.apply plugin: 'com.ios.application'

        assertTrue project.tasks.printConfig instanceof PrintTask
    }
}
