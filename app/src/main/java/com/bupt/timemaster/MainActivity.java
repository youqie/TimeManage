package com.bupt.timemaster;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.bupt.timemaster.adapter.ALeftAdapter;
import com.bupt.timemaster.adapter.ARightAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //左侧固定一列数据适配
    private ListView left_container_listview;
    private List<String> leftlList;

    //右侧数据适配
    private ListView right_container_listview;
    private List<Activities> activitiesList;

    private MyHorizontalScrollView title_horsv;
    private MyHorizontalScrollView content_horsv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        initData();
        initView();
    }

    private void findView() {
        title_horsv = (com.bupt.timemaster.MyHorizontalScrollView) findViewById(R.id.title_horsv);
        left_container_listview = (ListView) findViewById(R.id.left_container_listview);
        content_horsv = (com.bupt.timemaster.MyHorizontalScrollView) findViewById(R.id.content_horsv);
        right_container_listview = (ListView) findViewById(R.id.right_container_listview);
    }

    private void initView() {
        // 设置两个水平控件的联动
        title_horsv.setScrollView(content_horsv);
        content_horsv.setScrollView(title_horsv);
        //添加左侧数据
        ALeftAdapter adapter = new ALeftAdapter(this, leftlList);
        left_container_listview.setAdapter(adapter);
        UtilTools.setListViewHeightBasedOnChildren(left_container_listview);


        // 添加右边内容数据
        ARightAdapter myRightAdapter = new ARightAdapter(this, activitiesList);
        right_container_listview.setAdapter(myRightAdapter);
        UtilTools.setListViewHeightBasedOnChildren(right_container_listview);
        right_container_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Activities activities = (Activities) parent.getAdapter().getItem(position);
                Toast.makeText(MainActivity.this, activities.getTime(), Toast.LENGTH_LONG).show();
            }
        });
    }


    //初始化数据源
    private void initData() {

        activitiesList = new ArrayList<>();

//        for (int i = 0; i < 25; i++) {
//            int time = i;
//            String timeString = String.valueOf(time) + ":00";
//
//            activitiesList.add(new Activities( timeString,"1","1","1","1","1","1","1"));
//        }
        //测试数据：
        activitiesList.add(new Activities( "0","1","0","0","0","1","1","1"));
        activitiesList.add(new Activities( "1","1","0","0","0","1","1","1"));
        activitiesList.add(new Activities( "2","1","0","0","0","1","1","1"));
        activitiesList.add(new Activities( "3","1","0","0","0","1","1","1"));
        activitiesList.add(new Activities( "4","1","0","0","0","1","1","1"));
        activitiesList.add(new Activities( "5","1","0","0","0","1","1","1"));
        activitiesList.add(new Activities( "6","1","0","0","0","1","1","1"));
        activitiesList.add(new Activities( "7","1","0","0","0","1","1","1"));
        activitiesList.add(new Activities( "8","1","0","0","0","1","1","1"));
        activitiesList.add(new Activities( "9","0","0","1","0","1","1","1"));
        activitiesList.add(new Activities( "10","0","0","1","0","1","1","1"));
        activitiesList.add(new Activities( "11","0","0","1","0","1","1","1"));
        activitiesList.add(new Activities( "12","0","1","0","0","1","1","1"));
        activitiesList.add(new Activities( "13","1","0","0","0","1","1","1"));
        activitiesList.add(new Activities( "14","1","0","0","0","1","1","1"));
        activitiesList.add(new Activities( "15","0","0","1","0","1","1","1"));
        activitiesList.add(new Activities( "16","0","0","1","0","1","1","1"));
        activitiesList.add(new Activities( "17","0","0","1","0","1","1","1"));
        activitiesList.add(new Activities( "18","0","1","0","0","1","1","1"));
        activitiesList.add(new Activities( "19","0","0","1","0","1","1","1"));
        activitiesList.add(new Activities( "20","0","0","0","1","1","1","1"));
        activitiesList.add(new Activities( "21","0","0","0","1","1","1","1"));
        activitiesList.add(new Activities( "22","0","0","1","0","1","1","1"));
        activitiesList.add(new Activities( "23","1","0","0","0","1","1","1"));
        activitiesList.add(new Activities( "24","1","0","0","0","1","1","1"));


        leftlList = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            int time = i;
            String timeString = String.valueOf(time) + ":00";
            leftlList.add(timeString);
        }

    }
}
