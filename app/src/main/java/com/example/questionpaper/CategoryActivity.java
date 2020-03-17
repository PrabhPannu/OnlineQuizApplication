package com.example.questionpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import static com.example.questionpaper.SplashActivity.catList;

public class CategoryActivity extends AppCompatActivity {

    private GridView catGrid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Categories");

        CatGridAdapter adapter = new CatGridAdapter(catList);
        catGrid.setAdapter(adapter);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

       if(item.getItemId() == android.R.id.home)
        {
           CategoryActivity.this.finish();
        }
        return super.onOptionsItemSelected(item);

    }
}
