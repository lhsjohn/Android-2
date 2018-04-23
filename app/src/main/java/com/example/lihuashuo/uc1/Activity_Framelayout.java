package com.example.lihuashuo.uc1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by lihuashuo on 2018/4/19.
 */

public class Activity_Framelayout extends Activity {
    private int currentImageView=0;
    //定义一个图片数组
    final int images[]=new int[]{
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g
    };
    final int names[]=new int[]{
            R.id.btn1_framelayout,
            R.id.btn2_framelayout,
            R.id.btn3_framelayout,
            R.id.btn4_framelayout,
            R.id.btn5_framelayout
    };
    ImageView[] imageViews=new ImageView[names.length];
    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
        //表明消息是由本程序发送的
            if (msg.what==0x123){
                for (int i=0;i<names.length;i++)
                {
                    imageViews[i].setBackgroundResource(images[(i+currentImageView)%names.length]);

                }
                currentImageView++;

            }

        }

    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.framelayout);
        for (int i=0;i<names.length;i++){
            imageViews[i]=findViewById(names[i]);
        }
        //定义一个线程周期性的改变currentImageView的值
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                //发送一条空消息通知系统改变5个ImageView
                handler.sendEmptyMessage(0x123);
            }
        },0,1000);
        Button button=findViewById(R.id.btn_return_framelayout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity_Framelayout.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
