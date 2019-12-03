package com.dinner.dinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText name = findViewById(R.id.name);
        final EditText email = findViewById(R.id.email);
        Button registerBtn = findViewById(R.id.register_btn);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name2 = name.getText().toString();
                String email2 = email.getText().toString();
                Toast.makeText(RegisterActivity.this, "Name: " + name2 + "\n" + "Email: "
                        + email2, Toast.LENGTH_SHORT).show();


                Intent gotoRegisterActivity = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(gotoRegisterActivity);
            }
        });
    }
}