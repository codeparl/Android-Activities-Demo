package com.codeparl.activitydemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Chapter1 extends Activity {
protected void onCreate(Bundle savedInstanceState) {
	
	super.onCreate(savedInstanceState);
	setContentView(R.layout.chapter1);
	Intent   caller  =  getIntent();
	TextView qst  =  (TextView) findViewById(R.id.questiontextView1);
	TextView ans  =  (TextView) findViewById(R.id.answertextView1);
	qst.setText(caller.getStringExtra(MainActivity.EXTRA_QUESTION));
	ans.setText(caller.getStringExtra(MainActivity.EXTRA_ANSWER));
}
}
