package com.spark.easyleave;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    int currentId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOne = findViewById(R.id.applyLeave);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText u=findViewById(R.id.editText3);
                String user=u.getText().toString();
                EditText p=findViewById(R.id.editText4);
                String password=p.getText().toString();
                if(validation(user,password)==true) {

                    Intent activity2Intent = new Intent(getApplicationContext(), ProgramActivity.class);

                    activity2Intent.putExtra("curr", currentId);
                    startActivity(activity2Intent);
                }
                else
                {

                    Context context = getApplicationContext();
                    CharSequence text = "Enter Valid Credentials";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    System.out.println("Enter Valid Credentials");
                }

            }
        });
    }
    boolean validation(String email,String password)
    {
        int length=Users.appUsers.length;
        for(int i=0;i<length;i++){
            if(email.equals(Users.appUsers[i].emailId)&& password.equals(Users.appUsers[i].password)){
                currentId=i;
                return true;}
        }

        return  false;
    }

}
