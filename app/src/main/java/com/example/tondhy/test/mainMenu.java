package com.example.tondhy.test;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class mainMenu extends AppCompatActivity {
    static int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final TextView muncul = (TextView) findViewById(R.id.munculDisini);
        Button button = (Button) findViewById(R.id.clickThis);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
        public void onClick(View view) {


                if(i%2==0){
            muncul.setText("nah ini");}
                else{
                    muncul.setText("");
                }
               i=i+1;
        }


        });
        i=0;
    }

}
