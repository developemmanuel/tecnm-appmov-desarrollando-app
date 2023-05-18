package com.tecnm_appmoviles.app3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView nameTextView, dateTextView, phoneTextView, emailTextView, descriptionTextView;
    private Button editButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        nameTextView = findViewById(R.id.nameTextView);
        dateTextView = findViewById(R.id.dateTextView);
        phoneTextView = findViewById(R.id.phoneTextView);
        emailTextView = findViewById(R.id.emailTextView);
        descriptionTextView = findViewById(R.id.descriptionTextView);
        editButton = findViewById(R.id.editButton);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int day = intent.getIntExtra("day", 0);
        int month = intent.getIntExtra("month", 0);
        int year = intent.getIntExtra("year", 0);
        String phone = intent.getStringExtra("phone");
        String email = intent.getStringExtra("email");
        String description = intent.getStringExtra("description");

        nameTextView.setText("Name: " + name);
        dateTextView.setText("Date: " + day + "/" + month + "/" + year);
        phoneTextView.setText("Phone: " + phone);
        emailTextView.setText("Email: " + email);
        descriptionTextView.setText("Description: " + description);

        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("day", day);
                intent.putExtra("month", month);
                intent.putExtra("year", year);
                intent.putExtra("phone", phone);
                intent.putExtra("email", email);
                intent.putExtra("description", description);
                startActivity(intent);
                finish();
            }
        });
    }
}
