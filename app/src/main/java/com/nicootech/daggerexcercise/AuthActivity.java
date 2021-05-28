package com.nicootech.daggerexcercise;

import dagger.android.support.DaggerAppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;


public class AuthActivity extends DaggerAppCompatActivity {
    private  static final String TAG = "AuthActivity";
    @Inject
    String str;

    @Inject
    boolean isAppNull;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        Log.d(TAG, "onCreate: " + str);
        Log.d(TAG, "onCreate: is App Null ? "+isAppNull);
    }
}