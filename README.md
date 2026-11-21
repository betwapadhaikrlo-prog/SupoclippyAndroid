# SupoClip Android wrapper

This Android Studio project creates a simple installable APK that opens the hosted SupoClip site (`https://www.supoclip.com`) in an Android WebView.

**It is not a standalone AI/video processing server.** Clip generation requires the hosted service or a separately deployed/self-hosted SupoClip backend.

## Build APK

1. Open this project in Android Studio (or push it to a GitHub repository).
2. Build > Build APK(s), or run `gradle assembleDebug` with Gradle 8.9 and Android SDK 35.
3. APK output: `app/build/outputs/apk/debug/app-debug.apk`.

A GitHub Actions workflow is included: push to `main` and run the `Build SupoClip APK` workflow; download the artifact named `SupoClip-debug-apk`.
