tasks {
    "bootJar" { enabled = true }
    "jar" { enabled = false }
}

tasks.withType<org.springframework.boot.gradle.tasks.bundling.BootJar> {
    mainClass.set("com.sample.api.internal.InternalApiApplication")
}

dependencies {
    implementation(project(":sample-core:domain"))
    implementation(project(":sample-core:infra"))

    implementation("org.springframework.boot:spring-boot-starter-web")
    runtimeOnly("com.h2database:h2")
}