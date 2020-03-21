package com.example.test_20200319_intent06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ShareDataActivity extends AppCompatActivity {

    private TextView textViewShareData;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_data);

        setTitle("ShareData");

        textViewShareData = (TextView) findViewById(R.id.textView_sharedata);
        textViewShareData.setText("");

        intent = getIntent();

        String shareData = intent.getStringExtra(Intent.EXTRA_TEXT);

        textViewShareData.setText(shareData);

    }
}
