tasks {
    "bootJar" { enabled = false }
    "jar" { enabled = true }
}
dependencies {
    implementation(project(":sample-common"))
    implementation(project(":sample-core:domain:rdb"))
}
