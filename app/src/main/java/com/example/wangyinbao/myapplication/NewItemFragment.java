package com.example.wangyinbao.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.wangyinbao.myapplication.OnNewItemAddedListener;

/**
 * Created by wangyinbao on 2017/9/7.
 */



public class NewItemFragment extends Fragment {

    private OnNewItemAddedListener onNewItemAddedListener;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view = inflater.inflate(R.layout.new_item_fragment, container, false);

        final EditText myEditText = (EditText) view.findViewById(R.id.myEditText);
         myEditText.setOnKeyListener(new View.OnKeyListener() {
             @Override
             public boolean onKey(View v, int keyCode, KeyEvent event) {
               if (event.getAction() == KeyEvent.ACTION_DOWN){
                   if (keyCode == event.KEYCODE_DPAD_CENTER){
                       if (keyCode == event.KEYCODE_ENTER){
                           String newItem = myEditText.getText().toString();
                           onNewItemAddedListener.onNewItemAdded(newItem);
                           myEditText.setText("");
                           return true;
                       }
                   }
               }
                 return false;
             }
         });


         return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            onNewItemAddedListener = (OnNewItemAddedListener) context;
        }catch (ClassCastException e){
            e.printStackTrace();
        }
    }
}
