package com.example.vmokshsshah.technocrats;

import android.app.Fragment;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.List;

/**
 * Created by 'V'moksh S Shah on 19-05-2015.
 */
public class DeveloperFragment extends Fragment {

    Button img_fb, img_tw, img_g, img_l;

    public DeveloperFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.frgment_developer, container, false);


        img_fb = (Button) rootView.findViewById(R.id.img_f);
        img_tw = (Button) rootView.findViewById(R.id.img_tw);
        img_g = (Button) rootView.findViewById(R.id.img_g);
        img_l = (Button) rootView.findViewById(R.id.img_l);


        img_fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Test", "onClickListener ist gestartet");

                String facebookUrl = "https://www.facebook.com/vimox.shah";
                try {
                    int versionCode = getActivity().getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                    if (versionCode >= 3002850) {
                        Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        ;
                    } else {
                        // open the Facebook app using the old method (fb://profile/id or fb://pro
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    // Facebook is not installed. Open the browser
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                }
            }
        });

        img_tw.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                try {
                    // Check if the Twitter app is installed on the phone.
                    getActivity().getPackageManager().getPackageInfo("com.twitter.android", 0);

                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setClassName("com.twitter.android", "com.twitter.android.ProfileActivity");
                    // Don't forget to put the "L" at the end of the id.
                    intent.putExtra("user_id", 280942481L);
                    startActivity(intent);
                } catch (PackageManager.NameNotFoundException e) {
                    // If Twitter app is not installed, start browser.
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/Vimox_shah")));
                }
            }
        });

             img_g.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/+VimoxShah179/posts")));



            }
        });
            img_l.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("linkedin://https://www.linkedin.com/profile/view?id=277208291&trk=nav_responsive_tab_profile"));
                    final PackageManager packageManager =getActivity().getPackageManager();
                    final List<ResolveInfo> list = packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY);
                    if (list.isEmpty()) {
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/profile/view?id=277208291&trk=nav_responsive_tab_profile"));
                    }
                    startActivity(intent);
                }
            });



        return rootView;
    }
}
