package com.example.meowingkitty;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void clickThis(View v) {
		Toast quickGreeting = Toast.makeText(getApplicationContext(), "Rawr",
				Toast.LENGTH_SHORT);
		quickGreeting.show();
	}
	
	public void click4Sleepy(View v) {
		Intent intent = new Intent(this, SleepyActivity.class);
		startActivity(intent);
	}
	
	
	public void onClick(View v) {
		MediaPlayer play = MediaPlayer.create(getApplicationContext(), R.raw.lionrawr);
		play.start();
	}

}
