package com.example.questionpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteBindOrColumnIndexOutOfRangeException;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {
private TextView Score;
private Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_score );

        Score = findViewById(R.id.sa_score);
        done = findViewById( R.id.sa_done );

        String Score4_str = getIntent().getStringExtra( "SCORE" );
        Score.setText(Score4_str);

        done.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent( ScoreActivity.this,MainActivity.class );
                ScoreActivity.this.startActivity( intent );
                ScoreActivity.this.finish();
            }
        });
    }
}
