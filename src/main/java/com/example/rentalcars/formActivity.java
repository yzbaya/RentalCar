package com.example.rentalcars;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class formActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);

        TextView carNameTextView = findViewById(R.id.carName);
        if (getIntent() != null && getIntent().hasExtra("car_name")) {
            String carName = getIntent().getStringExtra("car_name");
            carNameTextView.setText(carName);
        }
        // Additional logic for your reservation form activity
    }
    }
