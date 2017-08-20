package com.example.wangyinbao.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by wangyinbao on 2017/8/19.
 */

public class MainInterfaceActivity  extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_maininterface);
        Intent intent = getIntent();
        Bundle bundle =intent.getBundleExtra("bundle");
        String user = bundle.getString("username");
        Log.e("MainInterface", user);

    }
}
