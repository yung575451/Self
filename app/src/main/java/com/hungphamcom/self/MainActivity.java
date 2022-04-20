package com.hungphamcom.self;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {
    private Button getStartedButton;
    private Button loginButton;
    private Button createAccount;
    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener authStateListener;
    private FirebaseUser currentUser;

    //Firestore connection
    private FirebaseFirestore db=FirebaseFirestore.getInstance();

    private EditText emailEditText;
    private EditText passwordEditText;
    private ProgressBar progressBar;
    private Button createAccountButton;
    private EditText userNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getStartedButton=findViewById(R.id.startButton);

        firebaseAuth=FirebaseAuth.getInstance();

        emailEditText=findViewById(R.id.email_account);
        passwordEditText=findViewById(R.id.password_account);
        progressBar=findViewById(R.id.login_progress);
        createAccountButton=findViewById(R.id.create_acct_button);
        userNameEditText=findViewById(R.id.username_account);


        getStartedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,
                        LoginActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        currentUser=firebaseAuth.getCurrentUser();
    }
}