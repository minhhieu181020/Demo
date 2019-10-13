package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private LinearLayout lnCourse, lnMaps, lnNews, lnSocials;
//    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        toolbar = findViewById(R.id.toolbar);
//        toolbar.setTitle("");
////        setSupportActionBar(toolbar);
//        setSupportActionBar(toolbar);
        lnCourse = findViewById(R.id.lnCourse);
        lnMaps = findViewById(R.id.lnMaps);
        lnNews = findViewById(R.id.lnNews);
        lnSocials = findViewById(R.id.lnSocials);
        lnCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CourseActivity.class);
                startActivity(intent);
            }
        });
        lnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Bản đồ", Toast.LENGTH_SHORT).show();
            }
        });
        lnNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Thông báo", Toast.LENGTH_SHORT).show();
            }
        });
        lnSocials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Chia sẻ thông tin", Toast.LENGTH_SHORT).show();
            }
        });
    }



}
