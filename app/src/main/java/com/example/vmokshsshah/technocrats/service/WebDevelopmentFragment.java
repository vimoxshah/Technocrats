package com.example.vmokshsshah.technocrats.service;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vmokshsshah.technocrats.R;

/**
 * Created by 'V'moksh S Shah on 16-05-2015.
 */
public class WebDevelopmentFragment extends Fragment {

    public WebDevelopmentFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_service_web, container, false);
        return rootView;
    }

}
