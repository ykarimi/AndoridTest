package com.yasaman.bookstore.BookStore;


import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.NoCopySpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.yasaman.bookstore.BaseActivity;
import com.yasaman.bookstore.R;
import com.yasaman.bookstore.SecondActivity;

public class ThirdActivity extends BaseActivity{
    private Button test;
    private TextView hello;
    private GridView gridView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);
        hello=(TextView)findViewById(R.id.text_view);
        Toast.makeText(this, getIntent().getExtras().getString(Intent.EXTRA_TEXT),Toast.LENGTH_SHORT).show();
        test= findViewById(R.id.test_button);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this , SecondActivity.class);
                startActivity(intent);
            }
        });
        hello.setText(R.string.hello);

    }



}
