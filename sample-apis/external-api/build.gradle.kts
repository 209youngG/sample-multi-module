tasks {
    "bootJar" { enabled = true }
    "jar" { enabled = false }
}
dependencies {
    implementation(project(":sample-core:domain"))
    implementation(project(":sample-core:infra"))

    implementation("org.springframework.boot:spring-boot-starter-web")
    runtimeOnly("com.h2database:h2")
}