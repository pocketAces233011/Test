package com.example.tondhy.test;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.widget.Button;

public class ForfragActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_forfrag);

    }

   // Button fr1 = (Button) findViewById(R.id.)
    public void changeFragment(View view){
       Fragment fragment;
        if(view == findViewById(R.id.buttonTo1)) {
            fragment = new Fragment1();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.details_fragment,fragment);
            ft.commit();
        }
        if(view == findViewById(R.id.buttonTo2)) {
            fragment = new Fragment2();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.details_fragment,fragment);
            ft.commit();
        }
        }
    }


