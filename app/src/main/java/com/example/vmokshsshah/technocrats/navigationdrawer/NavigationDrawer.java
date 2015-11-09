package com.example.vmokshsshah.technocrats.navigationdrawer;

/**
 * Created by 'V'moksh S Shah on 14-05-2015.
 */
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.vmokshsshah.technocrats.AboutusFragment;
import com.example.vmokshsshah.technocrats.CommunityFragment;
import com.example.vmokshsshah.technocrats.ContactusFragment;
import com.example.vmokshsshah.technocrats.DeveloperFragment;
import com.example.vmokshsshah.technocrats.OfferFragment;
import com.example.vmokshsshah.technocrats.PhotosFragment;
import com.example.vmokshsshah.technocrats.R;
import com.example.vmokshsshah.technocrats.RegestrationFragment;
import com.example.vmokshsshah.technocrats.ScanFragment;
import com.example.vmokshsshah.technocrats.service.ServiceFragment;

import java.util.ArrayList;
import java.util.List;



public class NavigationDrawer extends Activity {

    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;

    private CharSequence mDrawerTitle;
    private CharSequence mTitle;
    CustomDrawerAdapter adapter;

    List<DrawerItem> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_drawer);

        // Initializing
        dataList = new ArrayList<DrawerItem>();
        mTitle = mDrawerTitle = getTitle();
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

       mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow,
                GravityCompat.START);

        // Add Drawer Item to dataList
        dataList.add(new DrawerItem("Home", R.drawable.ic_home));
        dataList.add(new DrawerItem("Services", R.drawable.ic_pages));
        dataList.add(new DrawerItem("Offer", R.drawable.ic_offer));
        dataList.add(new DrawerItem("Live Project", R.drawable.ic_whats_hot));
        dataList.add(new DrawerItem("Communities", R.drawable.ic_communities));
        dataList.add(new DrawerItem("Photos", R.drawable.ic_photos));
        dataList.add(new DrawerItem("Online Apply", R.drawable.ic_regform));
        dataList.add(new DrawerItem("About Us", R.drawable.ic_people));
        dataList.add(new DrawerItem("Scan Certificates", R.drawable.ic_scan));
        dataList.add(new DrawerItem("Contact Us", R.drawable.ic_action_user));
        dataList.add(new DrawerItem("Developer", R.drawable.ic_devloper));



        adapter = new CustomDrawerAdapter(this, R.layout.custom_drawer_item,
                dataList);

        mDrawerList.setAdapter(adapter);

        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);

        mDrawerToggle = new ActionBarDrawerToggle(this,
                mDrawerLayout,
                R.drawable.ic_drawer1,
                R.string.drawer_open,
                R.string.drawer_close) {
            public void onDrawerClosed(View view) {
                getActionBar().setTitle(mTitle);
                invalidateOptionsMenu(); // creates call to
                // onPrepareOptionsMenu()
            }

            public void onDrawerOpened(View drawerView) {
                getActionBar().setTitle(mDrawerTitle);
                invalidateOptionsMenu(); // creates call to
                // onPrepareOptionsMenu()
            }
        };

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        if (savedInstanceState == null) {
            SelectItem(0);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void SelectItem(int possition) {

        Fragment fragment = null;
        Bundle args = new Bundle();
        switch (possition) {
            case 0:
                fragment = new HomeFragment();
                args.putString(FragmentOne.ITEM_NAME, dataList.get(possition)
                        .getItemName());
                args.putInt(FragmentOne.IMAGE_RESOURCE_ID, dataList.get(possition)
                        .getImgResID());
                break;
            case 1:
                fragment = new ServiceFragment();
                args.putString(FragmentOne.ITEM_NAME, dataList.get(possition)
                        .getItemName());
                args.putInt(FragmentOne.IMAGE_RESOURCE_ID, dataList.get(possition)
                        .getImgResID());
                break;
            case 2:
                fragment = new OfferFragment();
                args.putString(FragmentOne.ITEM_NAME, dataList.get(possition)
                        .getItemName());
                args.putInt(FragmentOne.IMAGE_RESOURCE_ID, dataList.get(possition)
                        .getImgResID());
                break;
            case 3:
                fragment = new FragmentOne();
                args.putString(FragmentOne.ITEM_NAME, dataList.get(possition)
                        .getItemName());
                args.putInt(FragmentOne.IMAGE_RESOURCE_ID, dataList.get(possition)
                        .getImgResID());
                break;
            case 4:
                fragment = new CommunityFragment();
                args.putString(FragmentOne.ITEM_NAME, dataList.get(possition)
                        .getItemName());
                args.putInt(FragmentOne.IMAGE_RESOURCE_ID, dataList.get(possition)
                        .getImgResID());
                break;
            case 5:
                fragment = new PhotosFragment();
                args.putString(FragmentOne.ITEM_NAME, dataList.get(possition)
                        .getItemName());
                args.putInt(FragmentOne.IMAGE_RESOURCE_ID, dataList.get(possition)
                        .getImgResID());
                break;
            case 6:
                fragment = new RegestrationFragment();
                args.putString(FragmentOne.ITEM_NAME, dataList.get(possition)
                        .getItemName());
                args.putInt(FragmentOne.IMAGE_RESOURCE_ID, dataList.get(possition)
                        .getImgResID());
                break;
            case 7:
                fragment = new AboutusFragment();
                args.putString(FragmentOne.ITEM_NAME, dataList.get(possition)
                        .getItemName());
                args.putInt(FragmentOne.IMAGE_RESOURCE_ID, dataList.get(possition)
                        .getImgResID());
                break;
            case 8:
                fragment = new ScanFragment();
                args.putString(FragmentOne.ITEM_NAME, dataList.get(possition)
                        .getItemName());
                args.putInt(FragmentOne.IMAGE_RESOURCE_ID, dataList.get(possition)
                        .getImgResID());
                break;


            case 9:
                fragment = new ContactusFragment();
                args.putString(FragmentOne.ITEM_NAME, dataList.get(possition)
                        .getItemName());
                args.putInt(FragmentOne.IMAGE_RESOURCE_ID, dataList.get(possition)
                        .getImgResID());
                break;
            case 10:
                fragment = new DeveloperFragment();
                args.putString(FragmentOne.ITEM_NAME, dataList.get(possition)
                        .getItemName());
                args.putInt(FragmentOne.IMAGE_RESOURCE_ID, dataList.get(possition)
                        .getImgResID());
                break;
            default:
                break;
        }

        fragment.setArguments(args);
        FragmentManager frgManager = getFragmentManager();
        frgManager.beginTransaction().replace(R.id.content_frame, fragment)
                .commit();

        mDrawerList.setItemChecked(possition, true);
        setTitle(dataList.get(possition).getItemName());
        mDrawerLayout.closeDrawer(mDrawerList);

    }

    @Override
    public void setTitle(CharSequence title) {
        mTitle = title;
        getActionBar().setTitle(mTitle);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Pass any configuration change to the drawer toggles
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // The action bar home/up action should open or close the drawer.
        // ActionBarDrawerToggle will take care of this.
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return false;
    }

    private class DrawerItemClickListener implements
            ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position,
                                long id) {
            SelectItem(position);

        }
    }

}

