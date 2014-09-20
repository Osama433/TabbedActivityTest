package com.example.testing;

import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GarageListViewFragment extends Fragment {
	public View onCreateView(LayoutInflater inflater, ViewGroup container,  
            Bundle savedInstanceState) {  
      // TODO Auto-generated method stub  
       View v;  
       v = inflater.inflate(R.layout.fragment_garagelistview, container,false);  
     return v;  
}  
}
