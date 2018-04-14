package com.example.lihuashuo.uc1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by lihuashuo on 2018/4/12.
 */

public class Activity_linearlayout extends Activity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linearlayout);
        Button button1 = findViewById(R.id.btn1_horizontal);
        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Activity_linearlayout.this, Activity_Linearlayout_Horizontal.class);
                        startActivity(intent);
                    }
                }
        );
        Button button2 = findViewById(R.id.btn1_vertical);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_linearlayout.this, Activity_Linearlayout_Vertical.class);
                startActivity(intent);

            }
        });

        Button button3 = findViewById(R.id.btn1_left);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
                 public void onClick(View v) {
               Intent intent=new Intent(Activity_linearlayout.this,Activity_Linearlayout_Left.class);
               startActivity(intent);
                                       }
                                   }
        );

        Button button4=findViewById(R.id.btn_return);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity_linearlayout.this,MainActivity.class);
                startActivity(intent);
            }
        });






    }
}
