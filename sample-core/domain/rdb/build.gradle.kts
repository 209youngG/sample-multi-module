tasks {
    "bootJar" { enabled = false }
    "jar" { enabled = true }
}
dependencies {
    implementation(project(":sample-common"))

    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
}
