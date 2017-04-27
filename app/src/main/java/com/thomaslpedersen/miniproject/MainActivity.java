package com.thomaslpedersen.miniproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NOTE = "com.thomaslpedersen.miniproject.NOTE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_note);
    }

    //Called when user taps 'Post-it!'-button//
    public void postNote(View view) {
        Intent intent = new Intent(this, PostNoteActivity.class);
        EditText textForPost = (EditText) findViewById(R.id.editText);
        String post = textForPost.getText().toString();
        intent.putExtra(EXTRA_NOTE, post);
        startActivity(intent);
    }
}