package com.bwie.test.mymooncake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Toast;

import com.bwie.test.adapter.RecyViewAdapter;
import com.bwie.test.bean.MoonBean;
import com.bwie.test.module.HttpModule;
import com.bwie.test.mymooncake.base.BaseActivity;
import com.bwie.test.mymooncake.contract.MoonContract;
import com.bwie.test.mymooncake.presenter.MoonPresenter;
import com.jcodecraeer.xrecyclerview.ProgressStyle;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MoonCakeActivity extends AppCompatActivity{
    private int num = 1;
    private XRecyclerView mRecyclerDuanzi;
    boolean falg = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moon_cake);
        //隐藏原有标题
        getSupportActionBar().hide();
    }
}
