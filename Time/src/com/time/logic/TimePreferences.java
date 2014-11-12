package com.time.logic;

import android.app.Application;
import android.content.Context;

public class TimePreferences {

	private static TimePreferences mInstance = null;
	private Context mContext;
	
	private TimePreferences (Application context) {
		mContext = context;
	}
	public static void init(Application context) {
		mInstance = new TimePreferences(context);
	}
	public static TimePreferences getInstance() {
		return mInstance;
	}
	
}
