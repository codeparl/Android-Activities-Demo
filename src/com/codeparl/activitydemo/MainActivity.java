package com.codeparl.activitydemo;

import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	
	public static final String EXTRA_QUESTION  = "EXTRA_QUESTION";
	public static final String EXTRA_ANSWER  = "EXTRA_ANSWER";
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}

	public void gotoChapter(View view) {
		
		//This HashMap will help us to determine
		//which activity to start at run-time
	HashMap<String, Class<?>>  activities  =  new HashMap<String, Class<?>>();
	activities.put(getString(R.string.chapter1), com.codeparl.activitydemo.Chapter1.class);
	activities.put(getString(R.string.chapter2), com.codeparl.activitydemo.Chapter2.class);
	activities.put(getString(R.string.chapter3), com.codeparl.activitydemo.Chapter3.class);
	activities.put(getString(R.string.chapter4), com.codeparl.activitydemo.Chapter4.class);
	activities.put(getString(R.string.chapter5), com.codeparl.activitydemo.Chapter5.class);
	
	//Let's store the answers that match a given question
	 HashMap<String, String> ANSWERS  =  new HashMap<String, String>();
	 String ans  = "Problem is a condition perceived by minds, that implies an inversion of consequence.";
	 ANSWERS.put(getString(R.string.chapter1), ans);
	 ans  = "Reasoning is a mental judgment based on a law for the validity of something that is valid.";
	 ANSWERS.put(getString(R.string.chapter2), ans);
	 
	 ans  = "Understanding is a reasoning tool that inhabits mind to differentiate the purpose of a fact where " + "the purpose is necessary.\r\n" ; 	
	 ANSWERS.put(getString(R.string.chapter3), ans);
	 
	 ans  = "Thinking is a mental decision or conclusion based on reasoning and logical comparison of facts.";
	 ANSWERS.put(getString(R.string.chapter4), ans);
	 
	 ans  = "We state that abstraction is a general principle perceived by mind that defines a necessary relationship between objects or concepts.";
	 ANSWERS.put(getString(R.string.chapter5), ans);
	 
	//we will create an appropriate intent to launch  an activity
	Button thisButton  =  (Button) view;
	String text  =  thisButton.getText().toString();
	Intent   message =  new Intent(MainActivity.this,activities.get(text));
	
	//let's send extra information (e.g. the question  and its answer)
	message.putExtra(EXTRA_QUESTION, "What is "+text.toLowerCase()+"? " );
	message.putExtra(EXTRA_ANSWER, ANSWERS.get(text) );
	startActivity(message);
	}//end method 
	
	
	
	 
	
}
