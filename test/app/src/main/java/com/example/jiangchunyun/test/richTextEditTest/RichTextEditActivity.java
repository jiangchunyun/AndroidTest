package com.example.jiangchunyun.test.richTextEditTest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.jiangchunyun.test.R;

public class RichTextEditActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    private void initView(){
        setContentView(R.layout.activity_rich_text_edit);
    }
}
