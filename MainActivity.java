package com.example.appdevaug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText NameInput,PhoneInput,EmailInput,PasswordInput;
    Button BtnRegister;
    TextView Details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NameInput = findViewById(R.id.NameInput);
        PhoneInput = findViewById(R.id.PhoneInput);
        EmailInput = findViewById(R.id.EmailInput);
        PasswordInput = findViewById(R.id.PasswordInput);
        BtnRegister = findViewById(R.id.BtnRegister);
        Details = findViewById(R.id.Details);

        BtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = NameInput.getText().toString();
                String phone = PhoneInput.getText().toString();
                String email = EmailInput.getText().toString();
                String password = PasswordInput.getText().toString();

                String msg = "Name : " +name + "\n" +
                        "Phone No. : " +phone + "\n" +
                        "Email ID : " +email + "\n" +
                        "Password : " + password + "\n";

                Log.d("MainActivity", msg);



            }
        });
    }
}
