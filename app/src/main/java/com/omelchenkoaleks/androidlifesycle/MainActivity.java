package com.omelchenkoaleks.androidlifesycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.text_view);
        Log.i("happy", "onCreate");
        mTextView.append("onCreate" + "\n");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("happy", "onStart");
        mTextView.append("onStart" + "\n");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("happy", "onResume");
        mTextView.append("onResume" + "\n");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("happy", "onPause");
        mTextView.append("onPause" + "\n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("happy", "onStop");
        mTextView.append("onStop" + "\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("happy", "onDestroy");
        mTextView.append("onDestroy" + "\n");
    }
}
