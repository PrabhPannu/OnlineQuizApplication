package com.example.questionpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toolbar;

public class Sets2Activity extends AppCompatActivity {

    private GridView sets_grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sets2);
        Toolbar toolbar = findViewById(R.id.set_toolbar);
        String  title= getIntent().getStringExtra("CATEGORY");
        toolbar.setTitle(title);


        sets_grid = findViewById(R.id.sets_gridview);
        Sets2Adapter adapter = new Sets2Adapter(6);
        sets_grid.setAdapter(adapter);
    }

}
