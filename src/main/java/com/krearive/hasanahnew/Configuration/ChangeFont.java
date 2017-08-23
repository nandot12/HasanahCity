package com.krearive.hasanahnew.Configuration;

import android.app.Application;

import com.krearive.hasanahnew.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by idn on 5/25/2017.
 */

public class ChangeFont extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/RoyalChicken.otf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
