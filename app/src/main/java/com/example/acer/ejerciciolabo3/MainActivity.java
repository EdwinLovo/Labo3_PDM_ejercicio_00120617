package com.example.acer.ejerciciolabo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.acer.ejerciciolabo3.utils.AppConstant;

public class MainActivity extends AppCompatActivity {

    private EditText name, lastname, email, genre;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        lastname = findViewById(R.id.lastname);
        email = findViewById(R.id.email);
        genre = findViewById(R.id.genre);
        send = findViewById(R.id.btn_send);

        send.setOnClickListener(v->{
            String name2 = name.getText().toString();
            String lastname2 = lastname.getText().toString();
            String email2 = email.getText().toString();
            String genre2 = genre.getText().toString();

            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            //intent.putExtra(AppConstant.);
            intent.putExtra(AppConstant.TEXT_NAME,name2);
            intent.putExtra(AppConstant.TEXT_LASTNAME,lastname2);
            intent.putExtra(AppConstant.TEXT_EMAIL,email2);
            intent.putExtra(AppConstant.TEXT_GENRE,genre2);
            startActivity(intent);
        });

    }
}
