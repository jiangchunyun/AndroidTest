package com.example.jiangchunyun.test.layoutAnimationTest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.example.jiangchunyun.test.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LayoutAnimationActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    private void initView(){
        setContentView(R.layout.activity_layout_animation_test);
        listView=findViewById(R.id.list_view_layout_animation);
        String[] strings = {"img","title","info","time"};//Map的key集合数组
        int[] ids = {R.id.img,R.id.title,R.id.info,R.id.time};//对应布局文件的id
        SimpleAdapter simpleAdapter = new SimpleAdapter(this,getData(),R.layout.item_layout_animation_test,strings,ids);
        listView.setAdapter(simpleAdapter);
    }

    private void setAnimation(TextView textView){
    }

    private List<HashMap<String, Object>> getData() {
        ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
        HashMap<String, Object> map = null;
        for (int i = 1; i <= 40; i++) {
            map = new HashMap<String, Object>();
            map.put("title", "人物" + i);
            map.put("time", "9月20日");
            map.put("info", "我通过了你的好友验证请求，现在我们可以开始对话啦");
            map.put("img", R.mipmap.ic_launcher);
            list.add(map);
        }
        return list;
    }
}
