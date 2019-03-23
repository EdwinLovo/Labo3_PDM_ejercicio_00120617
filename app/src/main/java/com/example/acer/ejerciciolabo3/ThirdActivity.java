package com.example.acer.ejerciciolabo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.acer.ejerciciolabo3.utils.AppConstant;

public class ThirdActivity extends AppCompatActivity {

    private TextView name, lastname, email, genre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        name = findViewById(R.id.name_message2);
        lastname = findViewById(R.id.lastname_message2);
        email = findViewById(R.id.email_message2);
        genre = findViewById(R.id.genre_message2);
        Intent intent = getIntent();
        if(intent!=null){
            name.setText(intent.getStringExtra(AppConstant.TEXT_NAME));
            lastname.setText(intent.getStringExtra(AppConstant.TEXT_LASTNAME));
            email.setText(intent.getStringExtra(AppConstant.TEXT_EMAIL));
            genre.setText(intent.getStringExtra(AppConstant.TEXT_GENRE));
        }
    }
}
