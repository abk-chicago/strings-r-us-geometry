package org.codeforcoffee.yeoldegeometryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mSumBtn;
    Button mAreaBtn;
    Button mVolumeBtn;
    Button mPyThBtn;

    Intent mSumIntent;
    Intent mAreaIntent;
    Intent mVolumeIntent;
    Intent mPyThIntent;
    // group it together

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSumBtn = (Button) findViewById(R.id.btn_calc_sum);
        mAreaBtn = (Button) findViewById(R.id.btn_calc_circle_area);
        mVolumeBtn = (Button) findViewById(R.id.btn_calc_volume);
        mPyThBtn = (Button) findViewById(R.id.btn_calc_pyth);


        mSumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSumIntent = new Intent(MainActivity.this, SumActivity.class);
                startActivity(mSumIntent);
            }
        });

        mAreaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAreaIntent = new Intent(MainActivity.this, AreaActivity.class);
                startActivity(mAreaIntent);
            }
        });

        mVolumeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mVolumeIntent = new Intent(MainActivity.this, VolumeActivity.class);
                startActivity(mVolumeIntent);
            }
        });

        mPyThBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPyThIntent = new Intent(MainActivity.this, PyThActivity.class);
                startActivity(mPyThIntent);
            }
        });

    }
}