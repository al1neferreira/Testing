plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.tests"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.tests"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //Tests
    testImplementation ("junit:junit:4.13.2")
    testImplementation ("org.mockito:mockito-core:3.11.2")
    testImplementation ("androidx.test:core:1.4.0")
    testImplementation ("androidx.test.ext:junit:1.1.3")
    testImplementation ("androidx.test.ext:truth:1.4.0")
    testImplementation ("com.google.truth:truth:1.1.3")
    testImplementation("org.robolectric:robolectric:4.13")

    // Optional -- Mockito framework
    testImplementation ("org.mockito:mockito-core:4.8.0")
    // Optional -- mockito-kotlin
    testImplementation ("org.mockito.kotlin:mockito-kotlin:5.4.0")
    // Optional -- Mockk framework
    testImplementation ("io.mockk:mockk:1.13.+")

}