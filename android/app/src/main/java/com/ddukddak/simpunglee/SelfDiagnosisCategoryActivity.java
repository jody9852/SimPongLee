package com.ddukddak.simpunglee;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SelfDiagnosisCategoryActivity extends AppCompatActivity {

    String url = "http://3.35.65.128:8080/simponglee/";

    int userid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        userid = getIntent().getIntExtra("userid", 0);
    }
}
