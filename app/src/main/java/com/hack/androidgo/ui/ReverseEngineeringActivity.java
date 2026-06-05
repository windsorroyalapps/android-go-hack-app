package com.hack.androidgo.ui;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class ReverseEngineeringActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // UI for RE: packet sniffer, decoder, etc.
        setContentView(R.layout.activity_re);
    }
}