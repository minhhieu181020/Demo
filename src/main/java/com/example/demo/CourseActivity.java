package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.List;

public class CourseActivity extends AppCompatActivity {
    private List<Course> courseList;
    private RecyclerView rvListCourse;
    private CourseDAO courseDAO;
//    private Toolbar tooCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        rvListCourse = findViewById(R.id.rvListCourse);
        courseDAO = new CourseDAO(CourseActivity.this);
        Course course = new Course("MOB101", "Android Giao dien", "Andriod programming", "5/10/2019 - 5/1/2020");
        Course course1 = new Course("MOB202", "Android nâng cao", "Andriod programming", "25/10/2019 - 19/2/2020");
        Course course2 = new Course("MOB303", "JavaScript", "Web design", "28/9/2019 - 28/12/2020");
        Course course3 = new Course("MOB404", "HTML5 & CSS3 nâng cao", "Web design", "7/10/2019 - 7/12/2020");

        boolean result = courseDAO.insertCourse(CourseDAO.TABLE_NAME, course);
        boolean result1 = courseDAO.insertCourse(CourseDAO.TABLE_NAME, course1);
        boolean result2 = courseDAO.insertCourse(CourseDAO.TABLE_NAME, course2);
        boolean result3 = courseDAO.insertCourse(CourseDAO.TABLE_NAME, course3);
        courseList = courseDAO.selectCourse(CourseDAO.TABLE_NAME);

        CourseAdapter courseAdapter = new CourseAdapter(CourseActivity.this, courseList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvListCourse.setLayoutManager(linearLayoutManager);
        rvListCourse.setAdapter(courseAdapter);
    }

    public void open(View view) {
        Intent intent = new Intent(CourseActivity.this, RegisteredActivity.class);
        startActivity(intent);
    }
}
