package com.example.wangyinbao.myapplication;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.et_username)
    EditText etUsernaem;
    @InjectView(R.id.et_password)
    EditText etPassword;

    String mName;
    String mPsw;
    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ListView mListView = (ListView) findViewById(R.id.myListView);
        final EditText mEditText = (EditText) findViewById(R.id.myEditText);
        final ArrayList<String> todoItems = new ArrayList<String>();

        final ArrayAdapter<String> aa;
        aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                todoItems);

        mListView.setAdapter(aa);

//       ButterKnife.inject(this);
//        Animation animation =  AnimationUtils.loadAnimation(this, R.anim.blink);
//        View view = findViewById(R.id.mView);
//        animation.setRepeatCount(20);
//        view.startAnimation(animation);
//
//         animation.setAnimationListener(new Animation.AnimationListener() {
//             @Override
//             public void onAnimationStart(Animation animation) {
//                 Log.i(TAG, "onAnimationStart");
//             }
//
//             @Override
//             public void onAnimationEnd(Animation animation) {
//                 Log.i(TAG, "onAnimationEnd");
//             }
//
//             @Override
//             public void onAnimationRepeat(Animation animation) {
//                 Log.i(TAG, "onAnimationRepeat");
//             }
//         });
//        Resources resources = getResources();

//        ImageView imageView = (ImageView) findViewById(R.id.iv_image);
//
//        imageView.setBackgroundResource(R.drawable.bg);
//        imageView.startAnimation(animation);
//        AnimationDrawable  animationDrawable =  (AnimationDrawable) imageView.getBackground();
//        animationDrawable.start();

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.i(TAG,"oride");
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            Log.i(TAG,"orientationChange");
        }


    }

    @Override
    protected void onRestart() {
        super.onRestart();
//
    }

    @Override
    protected void onStop() {
        super.onStop();
//        用来暂停或停止动画线程，传感器监听 GPS查询 定时器
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    //    private String TAG = "MainActivity";
//    Runnable mRun= new Runnable() {
//        @Override
//        public void run() {
//            mName.toLowerCase();
//            Intent intent = new Intent(MainActivity.this, MainInterfaceActivity.class);
//            Bundle mBundle = new Bundle();
//            mBundle.putString("username", mName);
//            mBundle.putString("userpass", mPsw);
//            intent.putExtra("bundle", mBundle);
//            MainActivity.this.startActivity(intent);
//
//        }
//    };
//    @OnClick(R.id.bt_go)
//
//    public void OnClick(View view){
//        switch (view.getId()){
//            case R.id.bt_go:
//                 mName = etUsernaem.getText().toString();
//                 mPsw = etPassword.getText().toString();
//                 startPostTask();
//                break;
//            case R.id.et_username:
//                int colors[] = new int[2];
//                colors[0] = 0xFFFFFF00;
//                colors[1] = 0xFF000000;
//                GradientDrawable gd = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, colors );
//                gd.setDither(true);
//                Toast.makeText(MainActivity.this, "shit", Toast.LENGTH_LONG).show();
//
//                break;
//        }
//    }
//
//    private void startPostTask() {
//        mRun.run();
//    }

}




























