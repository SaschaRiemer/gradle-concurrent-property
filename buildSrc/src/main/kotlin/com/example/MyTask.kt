package com.example

import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

abstract class MyTask: DefaultTask() {

    @Input
    abstract fun getSuccess(): Property<Boolean>

    @TaskAction
    fun exec() {
        if (!getSuccess().get()) {
            throw IllegalStateException("task was not successful")
        }
    }

}
