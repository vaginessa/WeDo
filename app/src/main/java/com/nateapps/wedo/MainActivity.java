package com.nateapps.wedo;

import android.os.Bundle;
import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.view.*;
import android.view.View.*;
public class MainActivity extends Activity 
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		Button butlevel1 = (Button) findViewById(R.id.level1);
		butlevel1.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View p1)
				{ setContentView(R.layout.level1);
				}
    });
}}
