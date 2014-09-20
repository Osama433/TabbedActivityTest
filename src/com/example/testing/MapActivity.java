package com.example.testing;

import android.support.v7.app.ActionBarActivity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MapActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);
		  final Button buttonDiscoverable = (Button) findViewById(R.id.buttonDiscoverable);
		  final Switch switchBluetooth = (Switch)findViewById(R.id.switchBluetooth);
		  final BluetoothAdapter bluetooth = BluetoothAdapter.getDefaultAdapter();
		  
		  switchBluetooth.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			    	if (isChecked)
					{
			    		if (!bluetooth.isEnabled()) {
			    			startActivityForResult(new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE), 0);
			    		}
					}else
					{
						bluetooth.disable();
					}
			    }
			});
		  
		  buttonDiscoverable.setOnClickListener(new View.OnClickListener() {
		   @Override
		   public void onClick(View arg0) {
		    if (!bluetooth.isDiscovering()) {
		     startActivityForResult(new Intent(
		       BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE), 0);

		     }
		   }
		  });
		  
		  
		  
		  
		  
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.map, menu);
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
