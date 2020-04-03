package com.mountain.basicphrases;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help2);

        TextView textView = findViewById(R.id.textView);

        textView.setMovementMethod(new ScrollingMovementMethod());

    }
}
