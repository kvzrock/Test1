package com.test;

import android.app.Activity;
import android.os.Bundle;

public class Test1Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*change1*/
        setContentView(R.layout.main);
    }
}