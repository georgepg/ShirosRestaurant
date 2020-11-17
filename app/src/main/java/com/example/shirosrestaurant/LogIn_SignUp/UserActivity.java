package com.example.shirosrestaurant.LogIn_SignUp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.shirosrestaurant.R;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class UserActivity extends AppCompatActivity {

    TextView emailTextView, passwordTextView;
    MaterialButton logautButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        emailTextView = findViewById(R.id.emailTextView);
        passwordTextView = findViewById(R.id.passwordTextView);
        logautButton = findViewById(R.id.logautButton);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        StringBuilder email = new StringBuilder();
        StringBuilder id = new StringBuilder();
        if (user != null){
            emailTextView.setText(email.append("Correo: ").append(user.getEmail()));

            passwordTextView.setText(id.append("ID: ").append(user.getUid()));
        }

        logautButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(UserActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}