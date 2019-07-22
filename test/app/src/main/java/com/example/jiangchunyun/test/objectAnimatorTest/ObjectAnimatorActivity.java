package com.example.jiangchunyun.test.objectAnimatorTest;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.jiangchunyun.test.R;

public class ObjectAnimatorActivity extends AppCompatActivity {
    private TextView mTvTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    private void initView(){
        setContentView(R.layout.activity_object_animation_test);
        mTvTitle=findViewById(R.id.TV_title);
        setAnimation(mTvTitle);
    }

    private void setAnimation(TextView textView){
        ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(textView,"alpha",1f,0f,1f);
        objectAnimator.setDuration(5000);
        objectAnimator.start();
    }
}
