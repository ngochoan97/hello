package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
        Toast.makeText(this, "Hello im master", Toast.LENGTH_SHORT).show();
=======
        Toast.makeText(this, "Hello im branch", Toast.LENGTH_SHORT).show();
>>>>>>> hoan
    }
}
