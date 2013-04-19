package com.pavelalon.smsg.view;

import com.pavelalon.smsg.adapters.ImageAdapter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.Display;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class MainActivity extends Activity {
	
	public static String SMSG_LOG = "SMSG_LOG";

	private static final int PICTURE_WIDTH = 85;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		GridView gridView = (GridView)findViewById(R.id.gridView);
		
		Log.d(SMSG_LOG, "Screen width: " + getSuitableNumberOfColumns());
		
		gridView.setNumColumns(getSuitableNumberOfColumns());
		ImageAdapter imageAdapter = new ImageAdapter(this);
		gridView.setAdapter(imageAdapter);
		
		gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long id) {
				Toast.makeText(MainActivity.this, String.valueOf(position), Toast.LENGTH_SHORT).show();
			}
			
		});
	}

	private int getSuitableNumberOfColumns() {
		return getWidth() / PICTURE_WIDTH;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	/**
	 * 
	 * @return the screen width
	 */
    @SuppressWarnings("deprecation")
	private int getWidth(){
    	WindowManager wm = (WindowManager) this.getSystemService(Context.WINDOW_SERVICE);
    	Display display = wm.getDefaultDisplay();
    	return display.getWidth();
    }

}
