package com.kingkan.cs58.sdu.traffcesignapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView titleTextView, detailTextView;
    ImageView signImageView;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        titleTextView=findViewById(R.id.txvTitle);
        detailTextView=findViewById(R.id.txvDetail);
        signImageView=findViewById(R.id.imvSign);

        titleTextView.setText(getIntent().getStringExtra("Title"));
        detailTextView.setText(getIntent().getStringExtra("Detail"));
        signImageView.setImageResource(getIntent().getIntExtra("Image",R.drawable.traffic_01));

    } //end onCreate

    public void clickBack(View view) {
        finish();


    }//end clickBack
}//end class
