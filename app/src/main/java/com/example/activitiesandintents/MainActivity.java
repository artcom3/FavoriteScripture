package com.example.activitiesandintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.activitiesandintents.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // Display Scripture
    public void displayScripture(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText editText1 = (EditText) findViewById(R.id.editText2);
        String book = editText1.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.editText3);
        String chapter = editText2.getText().toString();

        EditText editText3 = (EditText) findViewById(R.id.editText4);
        String verse = editText3.getText().toString();

        String message = book + " " + chapter + ":" + verse;

        Log.d("DisplayScripture", "About to create intent with " + message);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
