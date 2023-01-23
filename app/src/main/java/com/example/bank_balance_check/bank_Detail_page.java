package com.example.bank_balance_check;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class bank_Detail_page extends AppCompatActivity {

    TextView BankNumber;
    ImageView BankImage,Callbtn;

    int imgOfBank;
    String numberOfBank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_detail_page);
        initBinding();
        getIntentData();
        setIntentData();
        setonClick();
    }

    void initBinding()
    {
        BankNumber = findViewById(R.id.BankNumber);
        BankImage = findViewById(R.id.BankImage);
        Callbtn = findViewById(R.id.Callbtn);
    }

    void getIntentData() {
        imgOfBank = getIntent().getIntExtra("imgOfBank",0);
        numberOfBank = getIntent().getStringExtra("numberOfBank");
    }

    void setIntentData()
    {
        BankImage.setImageResource(imgOfBank);
        BankNumber.setText(numberOfBank);
    }

    void setonClick()
    {
        Callbtn.setOnClickListener(view -> {
            Uri uri = Uri.parse("tel:"+numberOfBank);
            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(uri);
            startActivity(intent);

        });
    }
}