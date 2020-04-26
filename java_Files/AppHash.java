
package com.ego;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;

import java.util.ArrayList;

public class AppHash extends ReactContextBaseJavaModule {
    private static ReactApplicationContext reactContext;

    AppHash(ReactApplicationContext context) {
        super(context);
        reactContext = context;
    }

    @Override
    public String getName() {
        return "AppHash";
    }

    @ReactMethod
    public void getHash(Promise promise) {
        try {
            AppSignatureHelperClass helper = new AppSignatureHelperClass(reactContext);
            ArrayList<String> signatures = helper.getAppSignatures();

            WritableArray arr = Arguments.createArray();
            for (String s : signatures) {
                arr.pushString(s);
            }
            promise.resolve(arr);
        } catch (Exception e) {
            promise.reject(e);
        }
    }
}