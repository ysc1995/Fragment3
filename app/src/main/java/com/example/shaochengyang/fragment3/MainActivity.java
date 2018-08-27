package com.example.shaochengyang.fragment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MyInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void getpassword(String data) {
        Fragment2 fragment2 = (Fragment2)getFragmentManager().findFragmentById(R.id.fragment2);
        fragment2.showpassdata(data);
    }

    @Override
    public void getusername(String data) {
        Fragment2 fragment2 = (Fragment2)getFragmentManager().findFragmentById(R.id.fragment2);
        fragment2.showuserdata(data);
    }
}
