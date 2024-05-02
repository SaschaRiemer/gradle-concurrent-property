package com.example

import org.gradle.api.GradleException
import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        if (target.rootProject != target) {
            throw GradleException("Must be applied to root project");
        }
        val ext = target.extensions.create("myExt", MyExtension::class.java)
        ext.getSuccess().finalizeValueOnRead()
        target.subprojects.forEach {
            it.tasks.register("myTask", MyTask::class.java) {
                getSuccess().set(ext.getSuccess())
            }
        }
    }

}
