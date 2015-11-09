package com.example.vmokshsshah.technocrats.navigationdrawer;

/**
 * Created by 'V'moksh S Shah on 14-05-2015.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vmokshsshah.technocrats.R;

/**
 * Created by 'V'moksh S Shah on 13-05-2015.
 */
public class FragmentOne extends Fragment {

    ImageView ivIcon;
    TextView tvItemName;

    public static final String IMAGE_RESOURCE_ID = "iconResourceID";
    public static final String ITEM_NAME = "itemName";

    public FragmentOne() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_layout_one, container,
                false);

      /*  Intent intent = new Intent(getActivity(),TabActivity.class);
        startActivity(intent);*/


        return view;
    }

}

