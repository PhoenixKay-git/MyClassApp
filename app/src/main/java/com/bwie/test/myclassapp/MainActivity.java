package com.bwie.test.myclassapp;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.bwie.test.ui.classify.ClassifyFragment;

public class MainActivity extends FragmentActivity {
    private FrameLayout mFl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        FragmentManager fragmentManager = getSupportFragmentManager();
        ClassifyFragment classifyFragment = new ClassifyFragment();
        fragmentManager.beginTransaction()
                .replace(R.id.flContent, classifyFragment)
                .commit();

    }

    private void initView() {
        mFl = (FrameLayout) findViewById(R.id.flContent);
    }
}
