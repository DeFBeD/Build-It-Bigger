package com.example.android.jokedisplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJoke extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        TextView jokeTextView = findViewById(R.id.joke_text);

        String incomingJoke;

        // get Intent from app Main Activity onClick
        Intent intent = getIntent();
        incomingJoke = intent.getStringExtra(getString(R.string.chosenJoke));

        if (incomingJoke != null) {
            jokeTextView.setText(incomingJoke);
        } else {
            jokeTextView.setText("I thought I had a joke, I guess not!");
        }
    }
}
