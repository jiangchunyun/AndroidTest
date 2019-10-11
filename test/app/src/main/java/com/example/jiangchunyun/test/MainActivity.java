package com.example.jiangchunyun.test;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTvTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        SharedPreferences sharedPreferences= PreferenceManager.getDefaultSharedPreferences();
        sharedPreferences.edit().putInt("hrihgt",10);
        int num = sharedPreferences.getInt("d",-1);
    }

    private void initView(){
        setContentView(R.layout.activity_main);
        mTvTitle=findViewById(R.id.TV_title);
        setAnimation(mTvTitle);
        Log.i("keyboard---------:",);
    }

    private void setAnimation(TextView textView){
        Animation animation=AnimationUtils.loadAnimation(this,R.anim.shake);
        textView.startAnimation(animation);
    }
}
