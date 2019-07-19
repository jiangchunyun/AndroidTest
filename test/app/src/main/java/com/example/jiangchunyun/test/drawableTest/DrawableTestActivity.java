package com.example.jiangchunyun.test.drawableTest;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import com.example.jiangchunyun.test.R;

public class DrawableTestActivity extends AppCompatActivity {
    private ImageView mIVdrawTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    private void initView(){
        setContentView(R.layout.activity_drawable_test);
        mIVdrawTest=findViewById(R.id.IV_drawable_test);
        setAnimation(mIVdrawTest);
    }

    private void setAnimation(ImageView imageView){
        imageView.setImageResource(R.drawable.drawable_test_animation);
        AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getDrawable();
        animationDrawable.start();
    }
}
