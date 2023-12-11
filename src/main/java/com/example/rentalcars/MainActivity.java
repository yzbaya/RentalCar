package com.example.rentalcars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first); // Replace with your main layout file

        // Find the "Je réserve" buttons and set click listeners to navigate to the formActivity
        Button reserveButton1 = findViewById(R.id.button2);
        reserveButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the formActivity when the button is clicked
                Intent intent = new Intent(MainActivity.this, formActivity.class);
                startActivity(intent);
            }
        });

        Button reserveButton2 = findViewById(R.id.button3);
        reserveButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, formActivity.class);
                startActivity(intent);
            }
        });

        Button reserveButton3 = findViewById(R.id.button4);
        reserveButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, formActivity.class);
                startActivity(intent);
            }
        });

        Button reserveButton4 = findViewById(R.id.button5);
        reserveButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, formActivity.class);
                startActivity(intent);
            }
        });
    }
}