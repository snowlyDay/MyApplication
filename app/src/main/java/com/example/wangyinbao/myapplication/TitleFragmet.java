package com.example.wangyinbao.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by wangyinbao on 2017/9/2.
 */

public class TitleFragmet extends Fragment {

    private String TAG = "TitleFragment";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.title_fragment, container, false);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.ib_title_btn);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "ib btn click");
            }
        });
        return view;
    }
}
