rootProject.name = "sample-multi-module"
include("sample-common")
include("sample-core:infra")
include("sample-core:client")
include("sample-core:domain:rdb")
include("sample-apis:internal-api")
include("sample-apis:external-api")
include("sample-batch")
include("sample-admin")
