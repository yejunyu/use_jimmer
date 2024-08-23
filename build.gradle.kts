plugins {
    id("org.springframework.boot") version "3.2.8"
    id("io.spring.dependency-management") version "1.1.6"
    kotlin("jvm") version "1.9.24"
    kotlin("plugin.spring") version "1.9.24"
    id("com.google.devtools.ksp") version "1.9.24-1.0.20"

}

group = "org.example"
version = "0.0.1-SNAPSHOT"

val jimmerVersion = "0.8.149"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

//repositories {
//    mavenCentral()
//}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    runtimeOnly("com.mysql:mysql-connector-j")
    implementation("org.springframework.boot:spring-boot-starter-jdbc")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("org.babyfish.jimmer:jimmer-spring-boot-starter:${jimmerVersion}")
    // 应用jimmer的ksp代码生成器
    ksp("org.babyfish.jimmer:jimmer-ksp:${jimmerVersion}")
    // 用户编写的实体代码所需的依赖
    implementation("org.babyfish.jimmer:jimmer-core:${jimmerVersion}")

//    implementation("com.baomidou:mybatis-plus-spring-boot3-starter:3.5.7")
    // 生成的代码所需的依赖，其他项目必然导入包含此依赖
    compileOnly("org.babyfish.jimmer:jimmer-sql:${jimmerVersion}")
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
    sourceSets.main {
        kotlin.srcDir("build/generated/ksp/main/kotlin")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
