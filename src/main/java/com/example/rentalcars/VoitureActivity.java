package com.example.rentalcars;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class VoitureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);

        Button reserveButton1 = findViewById(R.id.button2);
        Button reserveButton2 = findViewById(R.id.button3);
        Button reserveButton3 = findViewById(R.id.button4);
        Button reserveButton4 = findViewById(R.id.button5);

        reserveButton1.setOnClickListener(v -> navigateToReservation("Picanto"));
        reserveButton2.setOnClickListener(v -> navigateToReservation("Polo"));
        reserveButton3.setOnClickListener(v -> navigateToReservation("Mercedes"));
        reserveButton4.setOnClickListener(v -> navigateToReservation("Suzuki"));
    }

    private void navigateToReservation(String carName) {
        Intent intent = new Intent(VoitureActivity.this, formActivity.class);
        intent.putExtra("car_name", carName);
        startActivity(intent);
    }
}