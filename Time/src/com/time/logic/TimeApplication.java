package com.time.logic;

import android.app.Application;

public class TimeApplication extends Application{
	@Override
	public void onCreate() {
		super.onCreate();
		init();
	}

	private void init() {
		TimePreferences.init(this);
	}
}
