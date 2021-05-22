package com.example.mynation;

import com.sanjana.mynation.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity {
	public final static String LOAD_FILE = "com.example.helloworld.FILE";

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
    
    public void sendMessage(View view) {
    	//Intent intent 
    	myIntent = new Intent(this, DisplayMessageActivity.class);
    	//EditText editText = (EditText) findViewById(R.id.edit_message);
    	//String message = editText.getText().toString();
    	//intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(myIntent);
    }
    
    public void loadFruits(View view) {
    	//Intent intent
    	myIntent = new Intent(this, DisplayMessageActivity.class);
    	//EditText editText = (EditText) findViewById(R.id.edit_message);
    	//String message = editText.getText().toString();
    	myIntent.putExtra(LOAD_FILE, "leaders.xml");
    	startActivity(myIntent);
    }
    public void onClickHandler (View v) 
    {
    	System.out.println("onClickHandler>>>>");
    	//Intent intent 
    	myIntent = new Intent(this, DisplayMessageActivity.class);
        switch (v.getId()) {
        	case R.id.leaders:
        		myIntent.putExtra(LOAD_FILE, "leaders.xml");
        		break;
        	case R.id.leaders1:
        		myIntent.putExtra(LOAD_FILE, "leaders.xml");
        		break;
        	case R.id.anthem:
        		myIntent.putExtra(LOAD_FILE, "songs.xml");
        		break;
        	case R.id.anthem1:
        		myIntent.putExtra(LOAD_FILE, "songs.xml");
        		break;
        	case R.id.symbols:
        		myIntent.putExtra(LOAD_FILE, "symbols.xml");
        		break;
        	case R.id.symbols1:
        		myIntent.putExtra(LOAD_FILE, "symbols.xml");
        		break;
        	default:
        		myIntent.putExtra(LOAD_FILE, "leaders.xml");
        		break;
        }

        startActivity(myIntent);
    }
    private Intent myIntent;


    
}

