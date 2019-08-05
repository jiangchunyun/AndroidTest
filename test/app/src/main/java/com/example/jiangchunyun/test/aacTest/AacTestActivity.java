package com.example.jiangchunyun.test.aacTest;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleRegistry;
import android.arch.lifecycle.LifecycleRegistryOwner;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.jiangchunyun.test.R;

public class AacTestActivity extends AppCompatActivity {

    private LifecycleRegistry mlifecycleRegistry =new LifecycleRegistry(this);
    private AacTextView mAacTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.initView();
    }

    public void initView(){
        setContentView(R.layout.activity_aac_test);
        mAacTextView=findViewById(R.id.Tv_aac_test);
        mAacTextView.setLifecycle(getLifecycle());
        getLifecycle().addObserver(mAacTextView);
        mAacTextView.setLifeCycleEnable(true);
    }

    @Override
    public Lifecycle getLifecycle() {
        return mlifecycleRegistry;
    }
}
