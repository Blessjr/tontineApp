package com.example.tontineapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CardActivity extends AppCompatActivity {
    ConstraintLayout addIncome;
    ConstraintLayout addExpense;
    TextView nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_card);
        String name= getIntent().getStringExtra("name");
        nameText=findViewById(R.id.name_text);
        nameText.setText(name);
        addExpense=findViewById(R.id.addExpense);
        addIncome=findViewById(R.id.addIncome);
        addExpense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CardActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}