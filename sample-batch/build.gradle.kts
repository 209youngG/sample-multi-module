tasks {
    "bootJar" { enabled = false }
    "jar" { enabled = true }
}
dependencies {
    implementation(project(":sample-core:infra"))
    implementation(project(":sample-core:domain"))

    implementation("org.springframework.boot:spring-boot-starter-batch")
    testImplementation("org.springframework.batch:spring-batch-test")
    runtimeOnly("com.h2database:h2")
}