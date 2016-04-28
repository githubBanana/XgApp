package com.xs.xgapp;

import android.app.Application;

/**
 * @version V1.0 <描述当前版本功能>
 * @author: Xs
 * @date: 2016-04-28 15:58
 * @email Xs.lin@foxmail.com
 */
public class XgApplication extends Application {
    private static final String TAG = "XgApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        XgConfig.init(getApplicationContext());
    }
}
