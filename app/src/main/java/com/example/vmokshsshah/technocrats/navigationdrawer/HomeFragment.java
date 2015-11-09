package com.example.vmokshsshah.technocrats.navigationdrawer;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.vmokshsshah.technocrats.R;
import com.example.vmokshsshah.technocrats.RegestrationActivity;
import com.example.vmokshsshah.technocrats.Scan_QR;

import fab.FloatingActionButton;

/**
 * Created by 'V'moksh S Shah on 14-05-2015.
 */
public class HomeFragment extends Fragment {

    ImageButton fab;

    public HomeFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

         final View view =inflater.inflate(R.layout.home_fragment,container,false);




        final FloatingActionButton button = (FloatingActionButton)view.findViewById(R.id.action_c);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), RegestrationActivity.class);
                startActivity(i);


            }
        });

        FloatingActionButton button1 = (FloatingActionButton)view.findViewById(R.id.action_b);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Scan_QR.class);
                startActivity(i);


            }
        });


        return view;
    }
}
