package com.example.jiangchunyun.test.valueAnimationTest;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.jiangchunyun.test.R;

public class ValueAnimationActivity extends AppCompatActivity {
    private TextView mTvTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    private void initView(){
        setContentView(R.layout.activity_value_animation_test);
        mTvTitle=findViewById(R.id.TV_title);
        setAnimation(mTvTitle);
    }

    private void setAnimation(final TextView textView){
        ValueAnimator animation=ValueAnimator.ofFloat(0f,500f);
        animation.setDuration(5000);
        animation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                float currentValue= (float) animation.getAnimatedValue();
                textView.setWidth((int) currentValue);
            }
        });
        animation.start();
    }
}
