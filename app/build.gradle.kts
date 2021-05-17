plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdk = AndroidBuildConfig.compileSdk

    defaultConfig {
        applicationId = "com.kurantsov.moviesapp"
        minSdk = AndroidBuildConfig.minSdk
        targetSdk = AndroidBuildConfig.targetSdk
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(KotlinDependencies.kotlin)
    implementation(KotlinDependencies.kotlinCoroutinesAndroid)

    implementation(AndroidXDependencies.coreKtx)
    implementation(AndroidXDependencies.appCompat)
    implementation(AndroidMaterialDependencies.material)

    testImplementation(TestDependencies.jUnit)
    androidTestImplementation(AndroidTestDependencies.jUnit)
    androidTestImplementation(AndroidTestDependencies.espresso)
}