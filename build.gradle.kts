// Top-level build file where you can add configuration options common to all sub-projects/modules.
allprojects {
    group = "net.peakresponse.android.shared"
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.android.library) apply false
}