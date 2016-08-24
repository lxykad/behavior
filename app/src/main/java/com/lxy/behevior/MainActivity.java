package com.lxy.behevior;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    FloatingActionButton mFlab;
    TextView mDepentent;

    @Override
    void initView() {
        setContentView(R.layout.activity_main);
        mFlab = (FloatingActionButton) findViewById(R.id.fab);

        mDepentent = (TextView) findViewById(R.id.tv_depentent);

    }

    @Override
    void initData() {

    }

    @Override
    void initEvents() {
        mDepentent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewCompat.offsetTopAndBottom(v, 5);

            }
        });
    }

    public void clickShow(View view) {
        mFlab.setVisibility(View.GONE);
        startActivity(new Intent(MainActivity.this, ScrollActivity.class));

    }
}
