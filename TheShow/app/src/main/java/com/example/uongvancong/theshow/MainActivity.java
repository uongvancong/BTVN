package com.example.uongvancong.theshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn3, btn2, btn1, btnShow, btnHide;
    ImageView image1, image2, image3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btn3.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btnShow.setOnClickListener(this);
        btnHide.setOnClickListener(this);
    }

    private void init() {
        image1 = (ImageView) findViewById(R.id.image1);
        image2 = (ImageView) findViewById(R.id.image2);
        image3 = (ImageView) findViewById(R.id.image3);
        btn3 = (Button) findViewById(R.id.btn3);
        btn2 = (Button) findViewById(R.id.btn2);
        btn1 = (Button) findViewById(R.id.btn1);
        btnShow = (Button) findViewById(R.id.btnShow);
        btnHide = (Button) findViewById(R.id.btnHide);
    }

    @Override
    public void onClick(View v) {
        if (v == btn3) {
            image3.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
        }
        if (v == btn2) {
            image2.setVisibility(View.INVISIBLE);
            btn2.setVisibility(View.INVISIBLE);
        }
        if (v == btn1) {
            image1.setVisibility(View.INVISIBLE);
            btn1.setVisibility(View.INVISIBLE);
        }
        if (v == btnShow) {
            image1.setVisibility(View.VISIBLE);
            image2.setVisibility(View.VISIBLE);
            image3.setVisibility(View.VISIBLE);
            btn1.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);

        }
        if (v == btnHide) {
            image1.setVisibility(View.INVISIBLE);
            image2.setVisibility(View.INVISIBLE);
            image3.setVisibility(View.INVISIBLE);
            btn1.setVisibility(View.INVISIBLE);
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

        }


    }
}
