object Versions {
    const val supportLib = "27.1.1"
    const val rxJava = "2.2.0"
    const val rxAndroid = "2.0.2"
    const val things = "1.0"
    const val playServices = "11.6.0"
    const val kotlin = "1.2.60"
    const val gradle = "3.1.3"
    const val targetSdk = 27
    const val compileSdk = 27
}

object Libs {
    const val supportAppcompatV7 = "com.android.support:appcompat-v7:${Versions.supportLib}"
    const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
    const val things = "com.google.android.things:androidthings:${Versions.things}"
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jre7:${Versions.kotlin}"
    const val playServicesNearby = "com.google.android.gms:play-services-nearby:${Versions.playServices}"
}

object Plugins {
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val gradle = "com.android.tools.build:gradle:${Versions.gradle}"
}