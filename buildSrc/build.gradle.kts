plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

gradlePlugin {
    plugins {
        create("examplePlugin") {
            id = "com.example.ExamplePlugin"
            implementationClass = "com.example.MyPlugin"
        }
    }
}
