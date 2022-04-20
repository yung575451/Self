package com.hungphamcom.self;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.StorageReference;

public class PostJournalActivity extends AppCompatActivity implements View.OnClickListener {
    private Button saveButton;
    private ProgressBar progressBar;
    private ImageView addPhotoButton;
    private EditText titleEditText;
    private EditText thoughtsEditText;
    private TextView currentUserTextView;

    private String currentUserId;
    private String currentUserName;

    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener authStateListener;
    private FirebaseUser user;

    //connect to fire store;
    private FirebaseFirestore db=FirebaseFirestore.getInstance();
    private StorageReference storageReference;

    private CollectionReference collectionReference=db.collection("Journal");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_journal);

        firebaseAuth=FirebaseAuth.getInstance();
        progressBar=findViewById(R.id.post_progressBar);
        titleEditText=findViewById(R.id.post_title_et);
        thoughtsEditText=findViewById(R.id.post_description_et);
        currentUserTextView=findViewById(R.id.post_username_textview);

        saveButton=findViewById(R.id.post_save_journal_Button);
        saveButton.setOnClickListener(this);
        addPhotoButton=findViewById(R.id.postCameraButton);
        addPhotoButton.setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.post_save_journal_Button:
                break;
            case R.id.postCameraButton:
                break;
        }
    }
}