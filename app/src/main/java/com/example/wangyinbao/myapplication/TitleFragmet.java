package com.example.wangyinbao.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import java.awt.font.TextAttribute;

/**
 * Created by wangyinbao on 2017/9/2.
 */

public class TitleFragmet extends Fragment {

    private String TAG = "TitleFragment";
    private String mArgument;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null){
            mArgument = bundle.getString("jjj");
        }
    }

    public static ContentFragment newInstance(String argument){
        Bundle bundle = new Bundle();
        bundle.putString("jjj", argument );
        ContentFragment contentFragment = new ContentFragment();
        contentFragment.setArguments(bundle);
        return contentFragment;
    }
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
