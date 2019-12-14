package com.spark.easyleave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history_leave);
        Intent intent=getIntent();
        int currentId=intent.getIntExtra("curr",0);
        TextView tx1=findViewById(R.id.textView54);
        tx1.setText(Records.records[currentId].fromDate);
        TextView tx2=findViewById(R.id.textView301);
        tx2.setText(Records.records[currentId+1].fromDate);
        TextView tx3=findViewById(R.id.textView32);
        tx3.setText(Records.records[currentId+2].fromDate);

        TextView tx4=findViewById(R.id.textView55);
        tx4.setText(Records.records[currentId].toDate);
        TextView tx5=findViewById(R.id.textView322);
        tx5.setText(Records.records[currentId+1].toDate);
        TextView tx6=findViewById(R.id.textView332);
        tx6.setText(Records.records[currentId+2].toDate);

        TextView tx7=findViewById(R.id.textView56);
        TextView tx8=findViewById(R.id.textView43);
        TextView tx9=findViewById(R.id.textView33);
        if(Records.records[currentId].approved==true){
            tx7.setText("Approved");
        }
        else{
            tx7.setText("Disapproved");
        }
        if(Records.records[currentId+1].approved==true){
            tx8.setText("Approved");
        }
        else{
            tx8.setText("Disapproved");
        }
        if(Records.records[currentId+2].approved==true){
            tx9.setText("Approved");
        }
        else{
            tx9.setText("Disapproved");
        }


    }
}
