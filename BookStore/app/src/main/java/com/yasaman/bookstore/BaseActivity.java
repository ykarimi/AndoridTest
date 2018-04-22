package com.yasaman.bookstore;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.Toolbar;
import android.graphics.Color;
import android.view.View;


public class BaseActivity extends AppCompatActivity {
    Toolbar toolbar;

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    void initToolbar(String title) {
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(title);
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
    }

     void setNavigationIcon(int resource, View.OnClickListener onClickListener) {
        toolbar.setNavigationIcon(resource);
        toolbar.setNavigationOnClickListener(onClickListener);
    }


}
