package com.example.esportsmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView signin;
    Button signup;
    EditText email,username,password,confpassword,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   signin=findViewById(R.id.signin);
   email=findViewById(R.id.email);
   username=findViewById(R.id.username);
   password=findViewById(R.id.password);
   confpassword=findViewById(R.id.conformpassword);
   phone=findViewById(R.id.phone);
   signin.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           startActivity(new Intent(MainActivity.this,signin.class));
       }
   });

        signup=findViewById(R.id.signup);
        signup.setOnClickListener( new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                startactivity(new Intent(MainActivity.this,MainActivity2.class));

            }
             });


    }
    public Boolean passwordcheck(String pass,String conpass){
        if (pass.equals(conpass)) {
       return true;

        }
        else {
            return false;
        }
    }}