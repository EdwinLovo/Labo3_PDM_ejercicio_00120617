package com.example.acer.ejerciciolabo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.acer.ejerciciolabo3.utils.AppConstant;

public class SecondActivity extends AppCompatActivity {

    private TextView name, lastname, email, genre;
    private Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        name = findViewById(R.id.name_message);
        lastname = findViewById(R.id.lastname_message);
        email = findViewById(R.id.email_message);
        genre = findViewById(R.id.genre_message);
        share = findViewById(R.id.btn_share);

        Intent intent = getIntent();
        if(intent!=null){
            name.setText(intent.getStringExtra(AppConstant.TEXT_NAME));
            lastname.setText(intent.getStringExtra(AppConstant.TEXT_LASTNAME));
            email.setText(intent.getStringExtra(AppConstant.TEXT_EMAIL));
            genre.setText(intent.getStringExtra(AppConstant.TEXT_GENRE));
        }

        share.setOnClickListener(v->{
            String name2 = name.getText().toString();
            String lastname2 = lastname.getText().toString();
            String email2 = email.getText().toString();
            String genre2 = genre.getText().toString();
            Intent intent2 = new Intent();
            intent2.setType("text/plain");
            intent2.setAction(Intent.ACTION_SEND);
            intent2.putExtra(AppConstant.TEXT_NAME,name2);
            intent2.putExtra(AppConstant.TEXT_LASTNAME,lastname2);
            intent2.putExtra(AppConstant.TEXT_EMAIL,email2);
            intent2.putExtra(AppConstant.TEXT_GENRE,genre2);
            startActivity(intent2);
        });

    }
}
