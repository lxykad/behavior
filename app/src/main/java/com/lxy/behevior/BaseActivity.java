package com.lxy.behevior;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        initView();
        initData();
        initEvents();

    }

    abstract void  initView();
    abstract void  initData();
    abstract void  initEvents();
}
