package com.example.com.w1d3combetweenactiv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // print all logd on all callbacks
    private static final String TAG = "MainActivityTAG_";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // We wrote logd ************************
        Log.d(TAG, "onCreate: ");
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

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    public void clickMe(View view) {
        // this => the current context which contain info about the enviroment
        Intent intent = new Intent(this, Main2Activity.class);
        // String key, value primitive
        intent.putExtra("key", "value");
        startActivity(intent);
    }

    public void n2(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        EditText e = (EditText) findViewById(R.id.btnPW);
        String value = e.getText().toString();
        Log.d(TAG, "" + value);
        double sq = Math.pow(Double.parseDouble(value), 2);
        value = "" + sq;
        intent.putExtra("power", "" + value);
        startActivity(intent);
    }

    public void n3(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        EditText e = (EditText) findViewById(R.id.btnPW);
        String value = e.getText().toString();
        Log.d(TAG, "" + value);
        double p3 = Math.pow(Double.parseDouble(value), 3);
        value = "" + p3;
        intent.putExtra("power", "" + p3);
        startActivity(intent);
    }

    public void n4(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        EditText e = (EditText) findViewById(R.id.btnPW);
        String value = e.getText().toString();
        Log.d(TAG, "" + value);
        double sq = Math.pow(Double.parseDouble(value), 4);
        value = "" + sq;
        intent.putExtra("power", "" + value);
        startActivity(intent);
    }
}