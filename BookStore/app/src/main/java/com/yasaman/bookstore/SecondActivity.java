package com.yasaman.bookstore;


import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.yasaman.bookstore.BookStore.Author;
import com.yasaman.bookstore.BookStore.Book;
import com.yasaman.bookstore.BookStore.ThirdActivity;
import com.yasaman.bookstore.BookStore.User;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class SecondActivity extends BaseActivity {
    private TextView authorName;
    private TextView authorName2;
    private TextView authorName3;
    private TextView authorName4;
    private TextView bookName;
    private TextView bookName2;
    private TextView bookName3;
    private TextView bookName4;
    private ImageView book1;
    private ImageView book2;
    private ImageView book3;
    private ImageView book4;
    private ImageView topImage;
    private BottomNavigationView bottomNavigationView;
    private TextView user1_name;
    private ImageView user1_picture;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);


        findViews();
        initToolbar("Book Store");
        setNavigationIcon(R.drawable.ic_dehaze, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNavigationDrawer();
            }
        });
        User user = new User("yasaman karimi" , "ykarimi");
        Author author = new Author("J.K.Rowling" , "JK" , 12);
        ArrayList<Author>authors = new ArrayList<>();
        authors.add(author);
        Book book = new Book("Harry Potter" , authors);
        user1_name.setText(user.getName());
        authorName.setText(book.getAuthors().get(0).getName());
        authorName2.setText(book.getAuthors().get(0).getName());
        authorName3.setText(book.getAuthors().get(0).getName());
        authorName4.setText(book.getAuthors().get(0).getName());
        bookName.setText(book.getTitle());
        bookName2.setText(book.getTitle());
        bookName3.setText(book.getTitle());
        bookName4.setText(book.getTitle());
        findPictures();
        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
switch (item.getItemId()){
    case R.id.home_button:
        Toast.makeText(SecondActivity.this , " Home clicked" , Toast.LENGTH_SHORT).show();
        break;
    case R.id.account_button:
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_TEXT , "fghf");
        startActivity(Intent.createChooser(i,"share with:"));
        break;
    case R.id.saved_button:

        break;
}

                return false;
            }
        });

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                item.setChecked(true);
                drawerLayout.closeDrawers();
                return false;
            }
        });

        drawerLayout.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {


            }

            @Override
            public void onDrawerOpened(@NonNull View drawerView) {
            }

            @Override
            public void onDrawerClosed(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });
    }

    private void openNavigationDrawer() {
        drawerLayout.openDrawer(Gravity.LEFT);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.button_shopping_basket:
                Toast.makeText(this , "clicked" , Toast.LENGTH_SHORT ).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.second_activity_menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    void findPictures(){
        Picasso.with(this).load("http://i.imgur.com/DvpvklR.png").into(book1);
        Picasso.with(this).load("http://www.gajmarket.com/Media/Thumbs/0007/0007317--iq.jpg").into(book2);
        Picasso.with(this).load("http://www.gajmarket.com/Media/Thumbs/0007/0007322--1-.jpg").into(book3);
        Picasso.with(this).load("http://www.gajmarket.com/Media/Thumbs/0007/0007354--.jpg").into(book4);
        Picasso.with(this).load("http://www.gajmarket.com/Media/Thumbs/0027/0027542.jpg").into(topImage);
        Picasso.with(this).load("https://x1.xingassets.com/assets/frontend_minified/img/users/nobody_m.original.jpg").into(user1_picture);

    }


    private void findViews(){
        authorName = (TextView) findViewById(R.id.author_book1);
        authorName2 = (TextView) findViewById(R.id.author_book2);
        authorName3 = (TextView) findViewById(R.id.author_book3);
        authorName4 = (TextView) findViewById(R.id.author_book4);
        bookName = (TextView) findViewById(R.id.name_book1);
        bookName2 = (TextView) findViewById(R.id.name_book2);
        bookName3 = (TextView) findViewById(R.id.name_book3);
        bookName4 = (TextView) findViewById(R.id.name_book4);
        book1 = (ImageView) findViewById(R.id.book1);
        book2 = (ImageView) findViewById(R.id.book2);
        book3 = (ImageView) findViewById(R.id.book3);
        book4 = (ImageView) findViewById(R.id.book4);
        topImage = (ImageView) findViewById(R.id.top_image);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        user1_name =  navigationView.getHeaderView(0).findViewById(R.id.name_textview);
        user1_picture =  navigationView.getHeaderView(0).findViewById(R.id.profile_picture);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerlayout);
    }


}
