package com.codepath.debuggingchallenges.activities;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;


import com.codepath.debuggingchallenges.R;

public class ChangeBackgroundActivity extends AppCompatActivity {

    private int oldColor = Color.BLUE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_background);

       /* Button btnGo = findViewById(R.id.btnGo);

        btnGo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.d("myapp", "clicked");
                View mainView = findViewById(android.R.id.content);
                mainView.setBackgroundColor(getNextColor());
            }


        });*/
    }

    public void onGoClick(View view){
        View mainView = findViewById(android.R.id.content);
        mainView.setBackgroundColor(getNextColor());
    }


    private int getNextColor() {
        int newColor = (oldColor == Color.BLUE) ? Color.RED : Color.BLUE;
        oldColor = newColor;
        return newColor;
    }
}
