package com.example.vmokshsshah.technocrats;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vmokshsshah.technocrats.service.TabActivity;


public class OfferFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Intent intent = new Intent(getActivity(),OfferActivity.class);
        startActivity(intent);
        return super.onCreateView(inflater, container, savedInstanceState);
    }


}
