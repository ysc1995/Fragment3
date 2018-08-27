package com.example.shaochengyang.fragment3;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Fragment1 extends Fragment {

    TextView username, password;
    Button button;
    MyInterface myInterface;


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        myInterface= (MyInterface)getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1,container,false);
        button = view.findViewById(R.id.button);
        username=view.findViewById(R.id.usernameText);
        password = view.findViewById(R.id.passwordText);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                myInterface.getusername(username.getText().toString());
                myInterface.getpassword(password.getText().toString());
            }
        });
        return view;
    }
}
