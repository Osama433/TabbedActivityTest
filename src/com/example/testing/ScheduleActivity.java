package com.example.testing;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ScheduleActivity extends ActionBarActivity {
    ListView listView ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_schedule);
        listView = (ListView) findViewById(R.id.listSchedule);
        
        String[] values = new String[10];
        for(int x=0; x<10; x++)
        {
        	values[x]= "Event " +Integer.toString(x+1);
        }
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
          android.R.layout.simple_list_item_checked, android.R.id.text1, values);
       
        listView.setAdapter(adapter); 
        
        listView.setOnItemClickListener(new OnItemClickListener() {

              @Override
              public void onItemClick(AdapterView<?> parent, View view,
                 int position, long id) {
            	Toast mToast = Toast.makeText( getApplicationContext()  , "" , Toast.LENGTH_SHORT );

               String  itemValue    = (String) listView.getItemAtPosition(position);
               CheckedTextView textView = (CheckedTextView)view;
               textView.setChecked(!textView.isChecked());
               if(textView.isChecked())
               {
            	   mToast.setText( itemValue+ " Alarm On!");
            	   mToast.show();
            	   
               }else
               {
            	   
            	   mToast.setText( itemValue+ " Alarm Off!");
            	   mToast.show();
               }
               
               
              }

         }); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.schedule, menu);
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
