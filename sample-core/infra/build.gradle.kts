tasks {
    "bootJar" { enabled = false }
    "jar" { enabled = true }
}
dependencies {
    // 모듈 의존 하므로 코드를 재사용
    implementation(project(":sample-common"))
    implementation("com.github.ulisesbocchio:jasypt-spring-boot-starter:3.0.5")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:3.0.2")
}