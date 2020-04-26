# Retrieve-react-native-android-11char-hash-key<br/>

Retrieve android 11 digit hash key required for **SMS** retrieval during **OTP** capturing. Use it on your react-native project.<br/>

Step 1. Add the three java files to your projects **android/app/src/main/java/com/yourProjectName** folder.<br/>

Step 2. Open the three java files in any IDE and alter the line **"package com.yourProjectName"** to your **package name** it can found in the AndroidMainifest file.<br/>

Step 3. <br/>
&nbsp;&nbsp;&nbsp;a. Open **MainApplication.java** file and add this line ---> **import com.yourPackageName.AppHashPackage;** <br/>
&nbsp;&nbsp;&nbsp;b. Also add this line ---> **packages.add(new AppHashPackage());** inside **getPackages()** function, above **return** statement.<br/>

step 4. Now in any javascript file call this function --> **NativeModules.AppHash.getHash()** and it will return the 11-char hash key. The NativeModules.AppHash.getHash()returns a **promise**, handle it using async/await or try/catch or .then(). Import NativeModules from react-native.<br/>

## Once the hash code is retrieved remove all the above code changes or not, your choice.<br/>
## SMS format:<br/>

  > <#> Your Example app code is: 123ABC78<br/>
  &nbsp;&nbsp;f8Escobih1Z
    
for SMS retrival in react-native use this library --> https://www.npmjs.com/package/react-native-sms-retriever<br/>
developers.google link for suggestion --> https://developers.google.com/identity/sms-retriever/verify#1_construct_a_verification_message<br/>
react-native linking native code --> https://reactnative.dev/docs/native-modules-android
