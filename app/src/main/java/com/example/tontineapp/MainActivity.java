package com.example.tontineapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // Get the Recycler View
        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        // Set the layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Create the budget items
        List<BudgetItem> budgetItems = new ArrayList<>();
        budgetItems.add(new BudgetItem(2500, "username", "Send"));
        budgetItems.add(new BudgetItem(2500, "username2", "send"));
        budgetItems.add(new BudgetItem(2500, "username3", "send"));
        budgetItems.add(new BudgetItem(2500, "username3", "send"));

        // Create the adapter and set it on the Recycler View
        BudgetAdapter adapter = new BudgetAdapter(budgetItems);
        recyclerView.setAdapter(adapter);
    }
}