tasks {
    "bootJar" { enabled = true }
    "jar" { enabled = false }
}

springBoot{
    mainClass.set("com.sample.api.external.ExternalApiApplication")
}

dependencies {
    implementation(project(":sample-core:infra"))
    implementation(project(":sample-core:domain:rdb"))
    implementation(project(":sample-common"))

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    runtimeOnly("com.h2database:h2")
    testImplementation("io.rest-assured:rest-assured")
}