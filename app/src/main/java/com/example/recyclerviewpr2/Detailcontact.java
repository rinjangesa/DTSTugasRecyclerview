package com.example.recyclerviewpr2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detailcontact extends AppCompatActivity {

    ImageView imageView;
    TextView nama, notelfon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailcontact);
        getIncomingIntent();
    }

    private void getIncomingIntent()
    {
        String name = getIntent().getStringExtra("nama");
        String phone = getIntent().getStringExtra("phone");
        setImage(name,phone);
    }



    private void setImage(String name, String phone){

    nama = (TextView) findViewById(R.id.txtName);
    notelfon = (TextView) findViewById(R.id.txtPhone);
    nama.setText(name);
    notelfon.setText(phone);

    }



}