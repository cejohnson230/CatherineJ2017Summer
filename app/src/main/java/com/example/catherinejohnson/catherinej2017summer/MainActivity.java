package com.example.catherinejohnson.catherinej2017summer;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.catherinejohnson.catherinej2017summer.fragment.DemoFragment;
import com.example.catherinejohnson.catherinej2017summer.fragment.WorkFragment;

public class MainActivity extends AppCompatActivity {

    private TextView tv_demo;
    private TextView tv_work;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialView();
        setListener();
    }


    private void initialView() {
        //initialize the views to objects in java
        tv_demo = (TextView)findViewById(R.id.activity_tool_lft);
        tv_work = (TextView)findViewById(R.id.activity_tool_rht);

    }
//way #1 for how to listen for click for demo button
    private void setListener() {

        final WorkFragment workFragment = new WorkFragment();
        final DemoFragment demoFragment = new DemoFragment();



        tv_demo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //change colors on click
                tv_work.setTextColor(Color.BLACK);
                tv_demo.setTextColor(Color.RED);
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.activity_main_fragment, demoFragment).commit();
            }
        });
//This is way# 2 of how to listen for click for work button
        View.OnClickListener listener = new View.OnClickListener(){
            public void onClick(View v){
                //change color on click
                tv_work.setTextColor(Color.RED);
                tv_demo.setTextColor(Color.BLACK);
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.activity_main_fragment, workFragment).commit();
            }

        };
        tv_work.setOnClickListener(listener);
    }

    //top right button with head; the name
    //of this method should match the "onClick" in the XML file
    //this way is not advised since you may use a button to click for different things
    //use OnClick listener so you can easily find the logic
    public void login(View v){
        Toast.makeText(MainActivity.this, "You clicked login", Toast.LENGTH_SHORT);
    }
}
