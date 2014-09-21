package com.example.testing;

import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class GarageListViewFragment extends Fragment {
	ListView listView;
	public View onCreateView(LayoutInflater inflater, ViewGroup container,  
            Bundle savedInstanceState) {  
      // TODO Auto-generated method stub  
		
       View v;  
       v = inflater.inflate(R.layout.fragment_garagelistview, container,false);  
       listView = (ListView) v.findViewById(R.id.listGarageView);
       
       String[] values = new String[10];
       for(int x=0; x<10; x++)
       {
       	values[x]= "Item " +Integer.toString(x+1);
       }
     
       ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
         android.R.layout.simple_expandable_list_item_1, android.R.id.text1, values);
       
       listView.setAdapter(adapter); 
//       listView.setOnItemClickListener(new OnItemClickListener() {
//
//             @Override
//             public void onItemClick(AdapterView<?> parent, View view,
//                int position, long id) {
//           	Toast mToast = Toast.makeText( getActivity().getApplicationContext()  , "" , Toast.LENGTH_SHORT );
//
//              String  itemValue    = (String) listView.getItemAtPosition(position);
//              CheckedTextView textView = (CheckedTextView)view;
//              textView.setChecked(!textView.isChecked());
//              if(textView.isChecked())
//              {
//           	   mToast.setText( itemValue+ " Alarm On!");
//           	   mToast.show();
//           	   
//              }else
//              {
//           	   
//           	   mToast.setText( itemValue+ " Alarm Off!");
//           	   mToast.show();
//              }
//              
//              
//             }
//
//        }); 
     return v;  
}  
}
