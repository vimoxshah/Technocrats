package com.example.vmokshsshah.technocrats;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 'V'moksh S Shah on 16-05-2015.
 */
public class RegestrationFragment extends android.app.Fragment{

    public RegestrationFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        Intent intent = new Intent(getActivity(),RegestrationActivity.class);
        startActivity(intent);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
