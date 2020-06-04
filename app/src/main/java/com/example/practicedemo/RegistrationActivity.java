package com.example.practicedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

public class RegistrationActivity extends AppCompatActivity {
    EditText Name; EditText Surname; EditText Email; EditText phoneNumber; EditText PostalAddress;
    EditText Place; EditText Gender; EditText FotherName; EditText MotherName; TextView ifAlready;
    Button Register; Toolbar Registration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Name=findViewById(R.id.editText);
        Surname=findViewById(R.id.editText3);
        Email=findViewById(R.id.editText4);
        phoneNumber=findViewById(R.id.editText5);
        PostalAddress=findViewById(R.id.editText6);
        Place=findViewById(R.id.editText7);
        Gender=findViewById(R.id.editText8);
        FotherName=findViewById(R.id.editText9);
        MotherName=findViewById(R.id.editText10);
        ifAlready=findViewById(R.id.textView);
        Register=findViewById(R.id.button);
       // Registration=findViewById(R.id.Registration);

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Email.getText().toString().trim().length()==0){
                    Email.setError("Email is Required");
                    Email.requestFocus();
                }
               else if(phoneNumber.getText().toString().trim().length()==0){
                    phoneNumber.setError("Password is Required");
                    phoneNumber.requestFocus();
                }
                Intent it=new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(it);
            }
           // TextView mTitle = (TextView) Toolbar.findViewById(R.id.Registration);

           // setSupportActionBar(Toolbar);
           // mTitle.setText(Toolbar.getTitle());

           // getSupportActionBar().setDisplayShowTitleEnabled(false);
        });
    }
}
