package com.example

import org.gradle.api.provider.Property

interface MyExtension {

    fun getSuccess(): Property<Boolean>

}
