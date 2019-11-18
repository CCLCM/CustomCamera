package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import com.example.packageinstall.R;

import android.app.Activity;
import android.util.Log;
import android.widget.TextView;
import core.java.android.customcamera.CustomCameraManager;
public class MainActivity extends Activity {

    private static final String TAG = "CustomCamera";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView customcamera = (TextView) findViewById(R.id.customcamera);
        CustomCameraManager customCameraManager = (CustomCameraManager) getSystemService(Context.CUSTOM_CAMERA_SERVICE);
        customCameraManager.setName("hello! I am CustomCamera Service ...");
        String name = customCameraManager.getName();
        customcamera.setText(name);
        Log.d(TAG, "   " + name);
    }
}



