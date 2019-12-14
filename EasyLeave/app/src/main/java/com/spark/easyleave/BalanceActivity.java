package com.spark.easyleave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class BalanceActivity extends AppCompatActivity {

    int currentId = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance);

        Intent intent = getIntent();
        currentId = intent.getIntExtra("curr", 0);
        String s1 = "You are eligible for applying the leave";
        String s2 = "You are not eligible for applying the leave";

        TextView tx = findViewById(R.id.eligibility);
        Button applyLeave = findViewById(R.id.applyLeave);
        applyLeave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ApplicationForm.class));
            }
        });
        if (Balance.balances[currentId].balance > 0) {
            tx.setText("You are eligible for applying the leave");
        } else {
            tx.setText("You are not eligible for applying the leave");
        }


    }

    public void balance(View view) {
        Intent query = new Intent(this, QueryLeave.class);
        query.putExtra("curr", currentId);
        startActivity(query);
    }
}
