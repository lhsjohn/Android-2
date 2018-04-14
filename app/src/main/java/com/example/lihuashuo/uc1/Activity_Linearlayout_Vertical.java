package com.example.lihuashuo.uc1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.example.lihuashuo.uc1.R;

/**
 * Created by lihuashuo on 2018/4/12.
 */

public class Activity_Linearlayout_Vertical  extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linearlayout_vertical);
        Button button=findViewById(R.id.btn_return_vertical);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity_Linearlayout_Vertical.this,Activity_linearlayout.class);
                startActivity(intent);
            }
        });




    }
}
