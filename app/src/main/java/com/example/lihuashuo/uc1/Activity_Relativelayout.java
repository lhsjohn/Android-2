package com.example.lihuashuo.uc1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by lihuashuo on 2018/4/14.
 */

public class Activity_Relativelayout extends Activity{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relativelayout);
        Button button=findViewById(R.id.btn_return_relative);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity_Relativelayout.this,MainActivity.class);
                startActivity(intent);
            }
        });



    }
}
