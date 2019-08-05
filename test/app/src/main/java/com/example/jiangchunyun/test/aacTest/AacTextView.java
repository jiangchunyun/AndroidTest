package com.example.jiangchunyun.test.aacTest;
import android.annotation.SuppressLint;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.support.annotation.Nullable;
import android.arch.lifecycle.LifecycleObserver;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

@SuppressLint("AppCompatCustomView")
public class AacTextView extends TextView implements LifecycleObserver {

    private String TAG="AacTextView";
    private boolean lifeCycleEnable;
    private Lifecycle lifecycle;

    public AacTextView(Context context) {
        super(context);
    }

    public AacTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public AacTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    public boolean isLifeCycleEnable(){
        return lifeCycleEnable;
    }

    public void setLifeCycleEnable(boolean lifeCycleEnable) {
        this.lifeCycleEnable = lifeCycleEnable;
    }

    public Lifecycle getLifecycle(){
        return this.lifecycle;
    }

    public void setLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void create(@NotNull LifecycleOwner owner){
        if(lifeCycleEnable){
            String text=System.currentTimeMillis()+"create \n";
            Log.e(TAG,text);
            this.setText(text);
        }
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void resume(@NotNull LifecycleOwner owner){
        if(lifeCycleEnable){
            String text=System.currentTimeMillis()+"resume \n";
            Log.e(TAG,text);
            this.setText(text);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void pause(@NotNull LifecycleOwner owner){
        if(lifeCycleEnable){
            String text=System.currentTimeMillis()+"pause \n";
            Log.e(TAG,text);
            this.setText(text);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void stop(@NotNull LifecycleOwner owner){
        if(lifeCycleEnable){
            String text=System.currentTimeMillis()+"stop \n";
            Log.e(TAG,text);
            this.setText(text);
        }
    }
}
