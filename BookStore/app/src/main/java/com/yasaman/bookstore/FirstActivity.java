package com.yasaman.bookstore;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.net.URL;

public class FirstActivity extends BaseActivity {
    private TextView forgetPass;
    private Button logIn;
    private EditText userName;
    private EditText passWord;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
        Toast.makeText(FirstActivity.this , "mikham androido jedi yad begirm" , Toast.LENGTH_SHORT).show();
        forgetPass = (TextView) findViewById(R.id.forgetpass_textview);
        logIn = (Button) findViewById(R.id.login_button);
        userName = (EditText) findViewById(R.id.username_edittext);
        passWord = (EditText) findViewById(R.id.password_edittext);
        logIn.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         if (!TextUtils.isEmpty(userName.getText().toString().trim()) && !TextUtils.isEmpty(passWord.getText().toString().trim())) {

                                             Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                                             startActivity(intent);
                                         } else {
                                             Toast.makeText(FirstActivity.this, "Fill the blanks", Toast.LENGTH_SHORT).show();
                                         }
                                     }
                                 }
        );
        forgetPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.google.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


    }

  /*    @Override
  public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.first_activity_menu);
        return super.onCreateOptionsMenu(menu);
    }*/
}
