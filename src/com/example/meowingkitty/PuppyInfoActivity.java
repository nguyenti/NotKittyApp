package com.example.meowingkitty;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PuppyInfoActivity extends Activity {
	
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		getActionBar().setDisplayHomeAsUpEnabled(true);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_puppy_info);
		
		createList();
	}

	private ListView infoList;
	private ArrayAdapter<String> listAdapter;
	private Info stuff;

	public void createList() {
		// Grab the listView object from the xml
		infoList = (ListView) findViewById(R.id.listView1);

		// Create the Info object
		stuff = new Info("Doug", "2", "Squirrel!", "Dog", "I love you");

		// Create the nicely formatted String
		String[] listAbout = { "Name:\n " + stuff.name,
				"Age:\n " + stuff.age, "Quote:\n" + stuff.quote,
				"Species:\n " + stuff.species,
				"Description:\n" + stuff.description };

		// Fill the ArrayAdapter with our String array
		listAdapter = new ArrayAdapter<String>(this, R.layout.simple_row,
				listAbout);

		// Get the information from the ArrayAdapter into our list
		infoList.setAdapter(listAdapter);
	} // createList

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.puppy_info, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected (MenuItem item) 
	{
		Intent upIntent = new Intent(this, SleepyActivity.class);
		startActivity(upIntent);
		return true;
	} // onOptionsItemSelected (MenuItem)
	
}
