package dev.abd3lraouf.study.testcoveragereporter

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import javax.inject.Inject

open class TestCoverageReporterTask @Inject constructor(
    private val extension: TestCoverageReporterExtension
) : DefaultTask() {
    @TaskAction
    fun writeMessage() {
        println(extension.message)
    }
}