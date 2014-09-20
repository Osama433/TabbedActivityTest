package com.example.testing;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.Switch;

public class GarageActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_garage);
		final Switch switchView = (Switch)findViewById(R.id.switchView);
		
		
		
		switchView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
		    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		    	FragmentManager fm = getFragmentManager();  
				FragmentTransaction ft = fm.beginTransaction();  
				GarageIconViewFragment fragmentGarageIconView = new GarageIconViewFragment(); 
				GarageListViewFragment fragmentGarageListView = new GarageListViewFragment();
		    	if (isChecked)
				{
		    		ft.replace(R.id.activity_garage, fragmentGarageListView);
   		
		    		ft.commit(); 
				}else
				{
					
					ft.replace(R.id.activity_garage, fragmentGarageIconView);
		
					ft.commit(); 
				}
		    }
		});
		 
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.garage, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
