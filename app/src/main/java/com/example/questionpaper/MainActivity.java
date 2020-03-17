package com.example.questionpaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView title;
    private Button Start;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = findViewById(R.id.main_title);
        Start = findViewById(R.id.ma_startB);
        Typeface typeface = ResourcesCompat.getFont(this,R.font.blacklist);
        title.setTypeface(typeface);

        Start.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
             Intent intent  = new Intent(MainActivity.this,CategoryActivity.class);
             startActivity(intent);
            }
        });


    }
}
