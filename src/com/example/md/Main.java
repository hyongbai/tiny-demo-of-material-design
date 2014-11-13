package com.example.md;

import android.os.Bundle;
import android.widget.Toolbar;

/**
 * @project md
 * @time 2014年11月13日
 * @author ram
 */
public class Main extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initDrawer();
	}

	private void initDrawer() {
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		if (toolbar != null) {
			setSupportActionBar(toolbar);
			getSupportActionBar().setDisplayHomeAsUpEnabled(true);
			getSupportActionBar().setDisplayShowTitleEnabled(false);
		}
		DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
		ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, android.R.string.ok, android.R.string.no);
		mDrawerToggle.syncState();
		mDrawerLayout.setDrawerListener(mDrawerToggle);
	}

}
