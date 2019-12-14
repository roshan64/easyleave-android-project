package com.spark.easyleave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ProgramActivity extends AppCompatActivity {
    int currentId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);
        Intent intent=getIntent();
        currentId=intent.getIntExtra("curr",0);
    }
    public void toastMsg(String msg) {

        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();

    }
    public void displayToastMsg(View v) {

        toastMsg("Password changed Successfully");
        Button bt=findViewById(R.id.ba);
        Intent intent2=new Intent(this,BalanceActivity.class);
        intent2.putExtra("curr",currentId);
        startActivity(intent2);

    }
}
