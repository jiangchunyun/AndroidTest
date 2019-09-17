package com.example.jiangchunyun.test.viewLoadingTest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.jiangchunyun.test.R;

public class ViewTestActivity extends AppCompatActivity {
    private TextView mTvTitle;
    private VideoLoading mVideoLoading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    private void initView(){
        setContentView(R.layout.activity_view_test);
        mVideoLoading=findViewById(R.id.loading);
        mVideoLoading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<100;i++){
                    try{
                        mVideoLoading.setProgress(i);
                    }catch (Exception e){
                    }
                }
            }
        });
    }
}
