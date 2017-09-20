package com.example.tondhy.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.buttonClick);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("adaga");
    goToMain();
            }
        });
Button buttonFragment = (Button) findViewById(R.id.goToFragView);
        buttonFragment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                goToFrag();
            }
        });


    }
    private void goToMain(){

        Intent intent = new Intent(this, mainMenu.class);

        startActivity(intent);
    };

    private void goToFrag(){
    Intent intentFrag = new Intent(this, ForfragActivity.class);
    startActivity(intentFrag);
    }
}
