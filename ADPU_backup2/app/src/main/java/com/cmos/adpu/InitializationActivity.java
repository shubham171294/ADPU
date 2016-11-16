package com.cmos.adpu;

import android.os.Bundle;
import android.app.Activity;

public class InitializationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initialization);
        InitializationAsyncTask initializationAsyncTask = new InitializationAsyncTask(this);
        initializationAsyncTask.execute();
    }

}
