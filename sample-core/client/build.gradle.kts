tasks {
    "bootJar" { enabled = false }
    "jar" { enabled = true }
}
dependencies {
    implementation(project(":sample-common"))
}