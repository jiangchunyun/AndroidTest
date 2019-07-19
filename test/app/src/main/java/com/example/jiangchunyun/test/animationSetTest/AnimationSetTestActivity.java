package com.example.jiangchunyun.test.animationSetTest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import com.example.jiangchunyun.test.R;

public class AnimationSetTestActivity extends AppCompatActivity {
    private ImageView mIVanimationSetTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    private void initView(){
        setContentView(R.layout.activity_animation_set_test);
        mIVanimationSetTest =findViewById(R.id.IV_drawable_test);
        //setAnimationJavaCode(mIVanimationSetTest);
        setAnimationXml(mIVanimationSetTest);
    }

    private void setAnimationJavaCode(ImageView imageView){
        AlphaAnimation mAlphaAnimation=new AlphaAnimation(0.1f,1f);
        mAlphaAnimation.setDuration(5000);
        TranslateAnimation mTranslateAnimation=new TranslateAnimation(0.0f,100f,0.0f,100f);
        mTranslateAnimation.setDuration(5000);
        AnimationSet mAnimationSet=new AnimationSet(false);
        mAnimationSet.addAnimation(mAlphaAnimation);
        mAnimationSet.addAnimation(mTranslateAnimation);
        imageView.startAnimation(mAnimationSet);

    }

    private void setAnimationXml(ImageView imageView){
        AnimationSet mAnimationSet= (AnimationSet) AnimationUtils.loadAnimation(this,R.anim.animation_set_test);
        imageView.startAnimation(mAnimationSet);
    }
}
