package com.example.vmokshsshah.technocrats.service;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new AppDevelopmentFragment();
		case 1:
			// Games fragment activity
			return new CloudFragment();
		case 2:
			// Movies fragment activity
			return new ErpFragment();

			case 3:
				return new WebDevelopmentFragment();

		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 4;
	}

}
