package com.example.com.w1d3combetweenactiv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    // print all logd on all callbacks
    private static final String TAG = "Main2ActivityTAG_";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d(TAG, "onCreate: ");
//        Intent restoreContent = getIntent();
//        Toast.makeText(this, restoreContent.getStringExtra("key"), Toast.LENGTH_SHORT).show();

        Intent getResult = getIntent();
        TextView txtResult = (TextView) findViewById(R.id.txtRes);
        Log.d(TAG, (String) getResult.getStringExtra("power"));
        String value = getResult.getStringExtra("power");
        txtResult.setText(value);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
}
