package com.example.shaochengyang.fragment3;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {

    TextView user,pass;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2,container,false);
        user=view.findViewById(R.id.getUserName);
        pass = view.findViewById(R.id.getPassWord);
        return view;
    }

    public void showpassdata(String data){
        pass.setText(data);
    }

    public void showuserdata(String data){
        user.setText(data);
    }
}
