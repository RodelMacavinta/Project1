package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void Process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button3) {
            i = new Intent(this, homepage2.class);
            startActivity(i);
        }
    }
}
