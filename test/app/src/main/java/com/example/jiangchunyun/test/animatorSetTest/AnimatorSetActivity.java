package com.example.jiangchunyun.test.animatorSetTest;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.jiangchunyun.test.R;

public class AnimatorSetActivity extends AppCompatActivity {
    private TextView mTvTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    private void initView(){
        setContentView(R.layout.activity_animator_set_test);
        mTvTitle=findViewById(R.id.TV_title);
        setAnimation(mTvTitle);
    }

    private void setAnimation(TextView textView){
        ObjectAnimator objectAnimator1=ObjectAnimator.ofFloat(textView,"alpha",1f,0f,1f);
        ObjectAnimator objectAnimator2=ObjectAnimator.ofFloat(textView,"rotation",0f,360f);
        ObjectAnimator objectAnimator3=ObjectAnimator.ofFloat(textView,"translationX",-500f,0f);
        AnimatorSet animatorSet=new AnimatorSet();
        animatorSet.play(objectAnimator2).with(objectAnimator1).after(objectAnimator3);
        animatorSet.setDuration(5000);
        animatorSet.start();
    }
}
