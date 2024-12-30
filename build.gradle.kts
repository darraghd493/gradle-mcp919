plugins {
    id("java")
}

// Dependencies:
repositories {
    mavenCentral()
}

dependencies {
    implementation(fileTree("libs"))
}

// Task:
tasks.withType(JavaCompile::class.java) {
    options.encoding = "UTF-8"
}
