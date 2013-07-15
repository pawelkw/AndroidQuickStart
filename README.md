AndroidQuickStart
===

#What is this?
__AndroidQuickStart__ is a template application equipped with libraries essential (in my personal opinion) for building modern Android apps. It comes pre-configured as an Android Studio project so that all you need to do is open the project and start working!

#Features
* HoloEverywhere with ActionBarSherlock
* Fully configured Android Studio project
* Proguard config

#FAQ
__1. I've build the ReleaseUnsigned artifact but i can't install the ouput APK on my device. I get the ``INSTALL_PARSE_FAILED_NO_CERTIFICATES`` error.__

    As the artifact name states - the APK is unsigned, meaning it can't be installed on a physical device unless signed beforehand. You can sign the APK manually using the debug keystore provided with the Android SDK (or use a real keystore if you have one). To do that you can use the following command:
    
        jarsigner -verbose -digestalg SHA1 -sigalg MD5withRSA -keystore [path_to_keystore] -storepass android -keypass android [path_to_apk] androiddebugkey
        
    By default, under Linux, the debug.keystore for the SDK that comes with Android Studio is located under ``~/.android/debug.keystore``.
