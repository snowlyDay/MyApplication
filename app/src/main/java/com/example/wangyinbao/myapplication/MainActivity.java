package com.example.wangyinbao.myapplication;

import android.annotation.TargetApi;
import android.content.Intent;
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
import android.widget.EditText;
import android.widget.Toast;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.inject(this);
//        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
//        myToolbar.setLogo(R.mipmap.ic_launcher);
//        myToolbar.setTitle("it's my title");
//        myToolbar.inflateMenu(R.menu.menu);
//        myToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                int menuItemid = item.getItemId();
//                if (menuItemid == R.id.action_settings)
//                    Toast.makeText(MainActivity.this, "jjj", Toast.LENGTH_LONG).show();
//                return false;
//            }
//        });

    }

    private String TAG = "MainActivity";
    Runnable mRun= new Runnable() {
        @Override
        public void run() {
            mName.toLowerCase();
            Intent intent = new Intent(MainActivity.this, MainInterfaceActivity.class);
            Bundle mBundle = new Bundle();
            mBundle.putString("username", mName);
            mBundle.putString("userpass", mPsw);
            intent.putExtra("bundle", mBundle);
            MainActivity.this.startActivity(intent);

        }
    };
    @OnClick(R.id.bt_go)
    public void OnClick(View view){
        switch (view.getId()){
            case R.id.bt_go:
                 mName = etUsernaem.getText().toString();
                 mPsw = etPassword.getText().toString();
                 startPostTask();
                break;
            case R.id.et_username:
                int colors[] = new int[2];
                colors[0] = 0xFFFFFF00;
                colors[1] = 0xFF000000;
                GradientDrawable gd = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, colors );
                gd.setDither(true);
                Toast.makeText(MainActivity.this, "shit", Toast.LENGTH_LONG).show();

                break;
        }
    }

    private void startPostTask() {
        mRun.run();
    }

}




























