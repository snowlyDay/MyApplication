package com.example.wangyinbao.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.util.Log;
import android.widget.ListView;

import com.example.wangyinbao.myapplication.modle.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangyinbao on 2017/9/12.
 */

public class CustomListView extends Activity {

    private ListView mListView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_layout);

        mListView =(ListView) findViewById(R.id.myListView);

        ArrayList<User> arrayList = new ArrayList<User>();

        for(int i = 0; i< 10; i++){
            User user = new User("dd"+i,"d");
            arrayList.add(user);
        }

        UsersAdapter adapter = new UsersAdapter(this, arrayList);

        mListView.setAdapter(adapter);

        mListView.setOnScrollListener(new EndlessScrollListener() {
            @Override
            public boolean onLoadMore(int page, int totalItemCount) {
                Log.i("a", "ddd");
                return false;
            }
        });


    }


}
