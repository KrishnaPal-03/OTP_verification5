package com.example.otpverification;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Verificationotp2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_verificationotp2);

        //Button verifybuttonclick = findViewById(R.id.buttongetotp);

       // inputotp1 = findViewById(R.id.inputotp1);
       // inputotp2 = findViewById(R.id.inputotp2);
       // inputotp3 = findViewById(R.id.inputotp3);
      // inputotp4 = findViewById(R.id.inputotp4);
       // inputotp5 = findViewById(R.id.inputotp5);
       // inputotp6 = findViewById(R.id.inputotp6);

       // TextView textView = findViewById(R.id.textmobileshownumber);
       // textView.setText(String.format(
       //         "+91-%s",getIntent().getStringExtra(name: "mobile")
       // ));

       // verifybuttonclick.setOnClickListener((view -> );

    }
    public void openActivity(View v){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}