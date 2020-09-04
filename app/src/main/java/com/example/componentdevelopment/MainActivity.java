package com.example.componentdevelopment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.testapplication.ConstantUtil;

public class MainActivity extends AppCompatActivity {
    public  final String TAG=this.getClass().getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, String.valueOf(ConstantUtil.DIALOG_WIDTH));
    }
}