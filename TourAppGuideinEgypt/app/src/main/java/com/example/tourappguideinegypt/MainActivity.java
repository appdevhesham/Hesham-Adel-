package com.example.tourappguideinegypt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        AppFragmentsAdapter adapter = new AppFragmentsAdapter(this , getSupportFragmentManager()) ;
        viewPager.setAdapter(adapter);
        TabLayout
    }
}
