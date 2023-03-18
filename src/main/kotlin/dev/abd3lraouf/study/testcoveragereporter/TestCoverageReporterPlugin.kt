package dev.abd3lraouf.study.testcoveragereporter

import org.gradle.api.Plugin
import org.gradle.api.Project

class TestCoverageReporterPlugin: Plugin<Project> {
    override fun apply(project: Project) {
        val extension = project.extensions.create("testCoverageReporter", TestCoverageReporterExtension::class.java)
        project.tasks.create("writeMessage", TestCoverageReporterTask::class.java, extension)
    }
}