package com.nicootech.daggerexcercise.ui.main;

import android.os.Bundle;
import android.widget.Toast;

import com.nicootech.daggerexcercise.BaseActivity;
import com.nicootech.daggerexcercise.R;

import androidx.annotation.Nullable;

public class MainActivity extends BaseActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "This is Main Activity... ", Toast.LENGTH_SHORT).show();
    }
}
