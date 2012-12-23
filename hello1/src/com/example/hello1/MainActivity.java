package com.example.hello1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button startButton = (Button) findViewById(R.id.button1);
		startButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				EditText text1 = (EditText) findViewById(R.id.editText1);
				String et1 = text1.getText().toString();
				Toast.makeText(getApplicationContext(), "Merry Xmas "+ et1 + ".",
						Toast.LENGTH_SHORT).show();
				// startWork1();
			}
		});
	}
			@Override
			 public boolean onCreateOptionsMenu(Menu menu) {
			 // Inflate the menu; this adds items to the action bar if it is
			 // present.
			 getMenuInflater().inflate(R.menu.activity_main, menu);
			 return true;
			 }
}