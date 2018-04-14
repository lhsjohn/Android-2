package com.example.lihuashuo.uc1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener( new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         //获取启动当前Activity上的一个Intent
                                         Intent intent = new Intent(MainActivity.this, Activity_linearlayout.class);
                                         //启动intent对应的Activity
                                         startActivity(intent);
                                     }
                                 }
        );



    }
}
