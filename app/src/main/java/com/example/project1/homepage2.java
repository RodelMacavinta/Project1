package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class homepage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage2);
    }

    public void Process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button7) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}
