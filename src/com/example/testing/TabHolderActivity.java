package com.example.testing;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class TabHolderActivity extends TabActivity
{
	 private TabHost mTabHost;
            /** Called when the activity is first created. */
            
			@Override
            public void onCreate(Bundle savedInstanceState)
            {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_tabholder);

                    // create the TabHost that will contain the Tabs
                    mTabHost = (TabHost)findViewById(android.R.id.tabhost);
                    

                    TabSpec Map = mTabHost.newTabSpec("Map");
                    TabSpec Garage = mTabHost.newTabSpec("Garage");
                    TabSpec Schedule = mTabHost.newTabSpec("Schedule");
                    TabSpec Wallet = mTabHost.newTabSpec("Wallet");
                    TabSpec Bag = mTabHost.newTabSpec("Bag");
                    TabSpec Settings = mTabHost.newTabSpec("Setting");
//                    

                   // Set the Tab name and Activity
                   // that will be opened when particular Tab will be selected
                    Map.setIndicator("Map");
                    Map.setContent(new Intent(this,MapActivity.class));
                   
                    Garage.setIndicator("Garage");
                    Garage.setContent(new Intent(this,GarageActivity.class));

                    Schedule.setIndicator("Schedule");
                    Schedule.setContent(new Intent(this,ScheduleActivity.class));
                    
                    Wallet.setIndicator("Wallet");
                    Wallet.setContent(new Intent(this,WalletActivity.class));
                    
                    Bag.setIndicator("Bag");
                    Bag.setContent(new Intent(this,BagActivity.class));
                    
                    Settings.setContent(new Intent(this,SettingsActivity.class));
                   
                    /** Add the tabs  to the TabHost to display. */
                    mTabHost.addTab(Map);
                    mTabHost.addTab(Garage);
                    mTabHost.addTab(Schedule);
                    mTabHost.addTab(Wallet);
                    mTabHost.addTab(Bag);
              



            }
            public boolean onCreateOptionsMenu(Menu menu) {
        		// Inflate the menu; this adds items to the action bar if it is present.
        		getMenuInflater().inflate(R.menu.main, menu);
        		return true;
        	}
        	public boolean onOptionsItemSelected(MenuItem item) {
        	    // Handle presses on the action bar items
        	    switch (item.getItemId()) {
        	        case R.id.action_settings:
        	            openSettings();
        	            return true;
        	        default:
        	            return super.onOptionsItemSelected(item);
        	    }
        	}
        	public void openSettings(){
        		Intent intent = new Intent(this, SettingsActivity.class);
        		startActivity(intent);
        	}
} 