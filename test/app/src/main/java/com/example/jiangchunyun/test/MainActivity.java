package com.example.jiangchunyun.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTvTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    private void initView(){
        setContentView(R.layout.activity_main);
        mTvTitle=findViewById(R.id.TV_title);
        setAnimation(mTvTitle);
    }

    private void setAnimation(TextView textView){
        Animation animation=AnimationUtils.loadAnimation(this,R.anim.shake);
        textView.startAnimation(animation);
    }
}
