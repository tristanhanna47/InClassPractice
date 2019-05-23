package com.example.t00584336.inclasspractice;

import android.app.Activity;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    public static final String Count_Key = "count key";
    public static final String TAG = "main_potato";
    private int count = 0;
    TextView countText;

    @Override
    protected void onSaveInstanceState(Bundle outState) {     //creates a saved state for the emulator once it is turned
        super.onSaveInstanceState(outState);
        outState.putInt(Count_Key, count);
        Log.v(TAG, "saved value" + count);    //once the tag (potato) is searched inside the logcat, it  will track this method
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate" , Toast.LENGTH_LONG).show();
        Log.v(TAG, "onCreate called");        //once the tag (potato) is searched inside the logcat, it  will track this method

        countText = findViewById(R.id.countText);

        if (savedInstanceState != null) {
            count = savedInstanceState.getInt(Count_Key, 0);
        }
        else
        {
            count = 0;
        }
        showCount();
    }

    public void onClick (View view)
    {
        count++;
        showCount();
    }

    private void showCount()
    {
        countText.setText("" + count);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause" , Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume" , Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStop() {
        Toast.makeText(this, "onStop" , Toast.LENGTH_LONG).show();
        super.onStop();
    }

    @Override
    protected void onStart() {
        Toast.makeText(this, "onStart" , Toast.LENGTH_LONG).show();
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Toast.makeText(this, "onRestart" , Toast.LENGTH_LONG).show();
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(this, "onDestroy" , Toast.LENGTH_LONG).show();
        super.onDestroy();
    }


}
