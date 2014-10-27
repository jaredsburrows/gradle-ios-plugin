package burrows.apps.ios.tasks

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test

import static org.junit.Assert.assertTrue

class PrintTaskTest {

    @Test
    public void canAddTaskToProject() {
        Project project = ProjectBuilder.builder().build()

        assertTrue project.task('printConfig', type: PrintTask) instanceof PrintTask
    }
}
