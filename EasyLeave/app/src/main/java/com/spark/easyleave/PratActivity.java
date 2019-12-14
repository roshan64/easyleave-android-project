package com.spark.easyleave;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PratActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prat);
    }
    public void leave(View view){
        Intent i=new Intent(this, HistoryActivity.class);
        startActivity(i);
    }
    public void available(View view){
        Intent i=new Intent(this,Main3Activity.class);
        startActivity(i);
    }
}
