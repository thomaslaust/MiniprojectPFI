package com.thomaslpedersen.miniproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PostNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_note);

    //Get the Intent which started the activity, and get the string//
        Intent intent = getIntent();
        String post = intent.getStringExtra(MainActivity.EXTRA_NOTE);

        //Display the string within the textView//
        TextView textView = (TextView) findViewById(R.id.DisplayPostText);
        textView.setText(post);
    }
}
