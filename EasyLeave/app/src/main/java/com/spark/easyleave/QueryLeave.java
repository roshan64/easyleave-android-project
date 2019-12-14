package com.spark.easyleave;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QueryLeave extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query_leave);

        Intent intent = getIntent();
        int currentId = intent.getIntExtra("curr",0);
        TextView tx = findViewById(R.id.days);
        tx.setText("Your available balance is "+Balance.balances[currentId].balance+" days");
    }
    public void dummy(View view){
        //Intent i=new Intent(this,Dummy.class);
        //startActivity(i);
    }
}
