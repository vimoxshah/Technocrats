package com.example.vmokshsshah.technocrats;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 'V'moksh S Shah on 18-05-2015.
 */
public class ScanFragment extends Fragment {

    public ScanFragment() {

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        Intent intent = new Intent(getActivity(),Scan_QR.class);
        startActivity(intent);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
