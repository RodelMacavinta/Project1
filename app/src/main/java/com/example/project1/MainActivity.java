package com.example.project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Process(View v){
        if (v.getId() == R.id.reg) {
            Intent i = new Intent(this, reg.class);
            startActivity(i);
        }

        else if (v.getId() == R.id.login){
            Intent i = new Intent(this, login.class);
            startActivity(i);
        }

    }
}
