package com.spark.easyleave;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class ApplicationForm extends AppCompatActivity {
    CheckBox eligible;
    EditText fromText;
    EditText toText;
    EditText reason;
    EditText supEmail;
    EditText address;
    Leave leave = new Leave();
    final Calendar myCalendar = Calendar.getInstance();
    DatePickerDialog.OnDateSetListener fromDate = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {
            // TODO Auto-generated method stub
            myCalendar.set(Calendar.YEAR, year);
            myCalendar.set(Calendar.MONTH, monthOfYear);
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            updateLabel();
            Toast.makeText(ApplicationForm.this, myCalendar.getTime().toString(), Toast.LENGTH_LONG).show();
            fromText.setText(myCalendar.getTime().toString());
            leave.setFromDate(myCalendar.getTime().toString());
        }
    };
    DatePickerDialog.OnDateSetListener toDate = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {
            // TODO Auto-generated method stub
            myCalendar.set(Calendar.YEAR, year);
            myCalendar.set(Calendar.MONTH, monthOfYear);
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            updateLabel();
            Toast.makeText(ApplicationForm.this, myCalendar.getTime().toString(), Toast.LENGTH_LONG).show();
            toText.setText(myCalendar.getTime().toString());
            leave.setToDate(myCalendar.getTime().toString());
        }
    };

    private void updateLabel() {
        Toast.makeText(this, "Done with it", Toast.LENGTH_LONG).show();
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        fromText = findViewById(R.id.fromDate);
        toText = findViewById(R.id.toDate);
        eligible = findViewById(R.id.eligible);
        address = findViewById(R.id.addressForCommunication);
        reason = findViewById(R.id.reasonEditText);
        supEmail = findViewById(R.id.supEmailEditText);

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        eligible.setChecked(true);
                    }
                },
                4000);
        //from intent caller
        fromText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(ApplicationForm.this, fromDate, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
                Toast.makeText(ApplicationForm.this, "ca",
                        Toast.LENGTH_SHORT)
                        .show();
            }
        });

        toText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(ApplicationForm.this, toDate, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
                Toast.makeText(ApplicationForm.this, "ca",
                        Toast.LENGTH_SHORT)
                        .show();
            }
        });

    }


    public void submit(View view) {
        AlertDialog.Builder b = new AlertDialog.Builder(this);
        b.setTitle("Check Application Details").setMessage(
                "From Date: " + fromText.getText().toString()
                        + "\n To Date: " + toText.getText().toString()
                        + "\n Reason: " + reason.getText().toString()
                        + "\n SupEmail: " + supEmail.getText().toString()
                        + "\n Address: " + address.getText().toString()
                        + "\n\n User Details: \n"
                        + "Username:" + Users.appUsers[0].userName
                        + "\n Email-Id: " + Users.appUsers[0].emailId
                        + "\n User-Id: " + Users.appUsers[0].userId
                        + "\n Address: " + Users.appUsers[0].address
        ).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        })
                .setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(ApplicationForm.this, PratActivity.class));
                    }
                }).show();
    }
}
