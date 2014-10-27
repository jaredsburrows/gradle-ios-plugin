Gradle iOS Plugin -- BETA
=================

Gradle plugin for iOS mobile development

There is an Android Plugin for Gradle, why isn't there one for iOS?

Please see the Example - [iOS Gradle Example](https://github.com/jaredsburrows/gradle-ios-plugin-example)

## Requirements

- XCode (iOS SDK)
- CocoaPods (Dependencies)
- iOS-Deploy (Deploying to Devices)

#### Install XCode

https://developer.apple.com/xcode/

#### Install [CocoaPods](http://cocoapods.org/)

    sudo gem install cocoapods

#### Install [iOS-Deploy](https://github.com/phonegap/ios-deploy)(devices), [iOS-Sim](https://github.com/phonegap/ios-sim)(emulator) and/or the original [Fruitstrap](https://github.com/ghughes/fruitstrap)(devices <= iOS 6.1)

**iOS-Deploy:**

    brew install ios-deploy

**iOS-Sim:**

    brew install ios-sim

**Fruitstrap:**

    git clone "https://github.com/ghughes/fruitstrap.git"
    cd fruistrap
    make install

## Plugin Setup:

Add the plugin to your `buildscript`'s `dependencies` section:

    buildscript {
    	dependencies {
    		classpath 'com.github.jaredsburrows.tools.build.ios:gradle:0.0.1'
    	}
    	...
    }

Apply the `com.ios.application` plugin:

    apply plugin: 'com.ios.application'

## Example "build.gradle":

    buildscript {
    	repositories {
    		jcenter()
    	}

    	dependencies {
    		classpath 'com.github.jaredsburrows.tools.build.ios:gradle:0.0.1'
    	}
    }

    apply plugin: 'com.ios.application'

    ios {
        compileSdkVersion '8.1'     // iOS SDK version
        buildToolsVersion '6.1'     // XCode version

        defaultConfig {
            minSdkVersion 8         // Minimum iOS SDK version
            targetSdkVersion 19     // Target iOS SDK version
            versionCode 1           // *optional*
            versionName '1.0'       // *optional*
        }

        // Cocoa Pods
        pods {
            pod 'Google-Mobile-Ads-SDK'
            pod 'GoogleAnalytics-iOS-SDK'
        }
    }

    dependencies {
        ...
    }

Please see the Example - [iOS Gradle Exmaple](https://github.com/jaredsburrows/gradle-ios-plugin-example)

#### License

    Copyright (C) 2014 Gradle-iOS-Plugin by Jared Burrows

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
