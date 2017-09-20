package com.example.wangyinbao.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.wangyinbao.myapplication.modle.User;

import java.util.ArrayList;

/**
 * Created by wangyinbao on 2017/9/12.
 */

public class UsersAdapter extends ArrayAdapter<User> {


    public UsersAdapter(Context context, ArrayList<User> users) {
        super(context, 0 , users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        User user =getItem(position);

        if (convertView == null) {


            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);

        }

        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        TextView tvHoem = (TextView) convertView.findViewById(R.id.tvHome);
        tvHoem.setText(user.name);
        tvName.setText(user.hometown);

        return convertView;
    }
}
