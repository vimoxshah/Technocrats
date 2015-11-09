package com.example.vmokshsshah.technocrats.service;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 'V'moksh S Shah on 16-05-2015.
 */
public class ServiceFragment extends Fragment {


    public ServiceFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        Intent intent = new Intent(getActivity(),TabActivity.class);
        startActivity(intent);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
