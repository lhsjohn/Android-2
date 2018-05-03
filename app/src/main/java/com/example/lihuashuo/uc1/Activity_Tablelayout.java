package com.example.lihuashuo.uc1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by lihuashuo on 2018/4/23.
 */

public class Activity_Tablelayout extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablelayout);
        Button button=findViewById(R.id.btn_return_tablelayout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity_Tablelayout.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
