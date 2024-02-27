plugins {
    id("java")
    id ("org.springframework.boot") version("3.1.0")
    id ("io.spring.dependency-management") version("1.1.0")
}

allprojects {
    tasks.withType<JavaCompile> {
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }

    repositories {
        mavenCentral()
    }
}

subprojects {
    plugins.apply("java")
    plugins.apply("org.springframework.boot")
    plugins.apply("io.spring.dependency-management")

    dependencies {
        implementation("org.apache.commons:commons-lang3")
        implementation("org.apache.commons:commons-collections4:4.4")
        implementation("org.projectlombok:lombok")
        annotationProcessor("org.projectlombok:lombok")
        implementation("org.springframework.boot:spring-boot-starter-web")

        testImplementation("org.projectlombok:lombok")
        testAnnotationProcessor("org.projectlombok:lombok")
        testImplementation("org.springframework.boot:spring-boot-starter-test")
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}