# SimpleImages

Step 1. Add the JitPack repository to your build file

gradle
maven
sbt
leiningen
Add it in your root build.gradle at the end of repositories:
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
Step 2. Add the dependency
```
	dependencies {
	        implementation 'com.github.FunnCo:SimpleImages:1.0.0'
	}
  ```
That's it! The first time you request a project JitPack checks out the code, builds it and serves the build artifacts (jar, aar).
