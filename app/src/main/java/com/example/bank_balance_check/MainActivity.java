package com.example.bank_balance_check;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView RcView;
    List<ModelData> l1 = new ArrayList();

    String[] BankName = {"Axis Bank","BOB Bank","BOI Bank","HDFC Bank","ICICI Bank","Kotak Bank","SBI","Yes Bank"};
    int[] BankImage = {R.drawable.axis_bank,R.drawable.bob_bank,R.drawable.bank_of_india,R.drawable.hdfc_bank,R.drawable.icici_bank,R.drawable.kotak_mahindra_bank,R.drawable.state_bank,R.drawable.yes_bank_logo};
    String[] BankNumber = {"1800 419 5959","+91 8468001111","+91 9266135135","1800-270-3333","1860 120 7777","1800 274 0110","+91 9223766666 ","09223920000"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initBinding();
        initSetRView();
        for (int i = 0; i < BankNumber.length; i++) {
            ModelData M1 = new ModelData();
            M1.setBankImage(BankImage[i]);
            M1.setBankNumber(BankNumber[i]);
            l1.add(M1);
        }
    }

    void initBinding() {
        RcView = findViewById(R.id.RcView);
    }

    void initSetRView()
    {
        RVAdapter rvAdapter = new RVAdapter(this,l1);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        RcView.setLayoutManager(layoutManager);
        RcView.setAdapter(rvAdapter);
    }
}