package com.shamnafebin.backgroundcolor;

import android.os.Bundle;


import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.app.Activity;
import android.graphics.Color;


public class MainActivity extends Activity {
	Button b1,b2,b3;
	TextView t;
	RelativeLayout re;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
        b3=(Button)findViewById(R.id.btn3);
        t=(TextView)findViewById(R.id.txt);
        re=(RelativeLayout)findViewById(R.id.rl);
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				re.setBackgroundColor(Color.RED);
			}
		});
        b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				re.setBackgroundColor(Color.BLUE);
			}
		});
        b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				re.setBackgroundColor(Color.GREEN);
			}
		});
        
        
    }


   
}
