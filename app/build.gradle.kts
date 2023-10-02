plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")

}
android {
    signingConfigs {
        create("release") {
            storeFile =
                file("C:\\Users\\Anil\\Downloads\\thirdCopyColorCaller\\ColorCallerNeonKeyboard-master\\colorPhone.jks")
            storePassword = "123456"
            keyAlias = "key0"
            keyPassword = "123456"
        }
    }
    compileSdk = 33
    defaultConfig {
        applicationId = "com.themecolor.callerphone.wallpaper"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
        renderscriptTargetApi = 29
        renderscriptSupportModeEnabled = true
//        setProperty("archivesBaseName", "Color Phone: Call Screen Theme $versionName")
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        signingConfig = signingConfigs.getByName("release")


        /*javaCompileOptions {
            annotationProcessorOptions {
                arguments += mapOf(
                    Pair("room.schemaLocation", "$projectDir/schemas"),
                    Pair("room.incremental", "true"),
                    Pair("room.expandProjection", "true")
                )
            }
        }*/
    }

    buildTypes {
        getByName("debug") {

            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        getByName("release") {

            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }


    }


    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    namespace = "com.themecolor.callerphone.wallpaper"



    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }


    buildFeatures {
        viewBinding = true
        dataBinding=true
    }

}

dependencies {
    val koinVersion = "3.0.2"

    implementation("com.github.bumptech.glide:glide:4.16.0")
    implementation("com.intuit.sdp:sdp-android:1.1.0")
    implementation("androidx.work:work-runtime-ktx:2.8.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation(project(mapOf("path" to ":aosp")))
    implementation("androidx.room", "room-ktx", "2.5.0-beta02")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation ("org.jetbrains.kotlin:kotlin-stdlib:1.8.22")
    implementation("androidx.test.ext:junit-ktx:1.1.5")
    kapt("androidx.room", "room-compiler", "2.5.0-beta02")
    implementation("io.insert-koin:koin-core:3.0.2")
    implementation("io.insert-koin:koin-android:3.0.2")
    //color caller dependency
    implementation ("com.makeramen:roundedimageview:2.3.0")
    implementation ("com.google.code.gson:gson:2.10.1")
    implementation ("com.koushikdutta.ion:ion:3.0.8")
    implementation ("com.koushikdutta.async:androidasync:3.0.8")
    implementation ("com.makeramen:roundedimageview:2.3.0")
    implementation ("com.romainpiel.shimmer:library:1.4.0")
    implementation ("com.github.yalantis:ucrop:2.2.6")
    implementation ("com.squareup.okhttp3:okhttp:4.11.0")
    implementation ("com.squareup.okio:okio:3.2.0")
    implementation ("com.squareup.picasso:picasso:2.71828")
    implementation ("org.jsoup:jsoup:1.14.3")
    implementation ("com.android.volley:volley:1.2.1")
    implementation ("com.google.code.gson:gson:2.10.1")
    implementation ("com.commit451:PhotoView:1.2.4")
    implementation ("com.github.devlight:infinitecycleviewpager:1.0.2")
    implementation ("com.github.judemanutd:autostarter:1.0.6")
    implementation ("com.synnapps:carouselview:0.1.4")
    implementation ("com.daimajia.androidanimations:library:2.4@aar")
    implementation ("pl.droidsonroids.gif:android-gif-drawable:1.2.25")
    implementation ("de.hdodenhof:circleimageview:3.1.0")
    implementation ("io.reactivex.rxjava2:rxandroid:2.0.2")
    implementation ("androidx.work:work-runtime-ktx:2.8.1")

//    implementation project(path: ':adsmodule')
//    implementation project(path: ':aosp')

    implementation ("androidx.lifecycle:lifecycle-process:2.6.2")
    implementation(project(":adsmodule"))
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar")))) // File-based JAR dependencies

//    implementation fileTree(dir: "libs", include: ["*.jar"])


}
