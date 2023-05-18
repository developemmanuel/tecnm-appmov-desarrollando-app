package com.tecnm_appmoviles.app3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText, phoneEditText, emailEditText, descriptionEditText;
    private DatePicker datePicker;
    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.nameEditText);
        datePicker = findViewById(R.id.datePicker);
        phoneEditText = findViewById(R.id.phoneEditText);
        emailEditText = findViewById(R.id.emailEditText);
        descriptionEditText = findViewById(R.id.descriptionEditText);
        nextButton = findViewById(R.id.nextButton);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                int day = datePicker.getDayOfMonth();
                int month = datePicker.getMonth();
                int year = datePicker.getYear();
                String phone = phoneEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String description = descriptionEditText.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("day", day);
                intent.putExtra("month", month);
                intent.putExtra("year", year);
                intent.putExtra("phone", phone);
                intent.putExtra("email", email);
                intent.putExtra("description", description);
                startActivity(intent);
            }
        });
    }
}
