package com.czettner.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private FrameLayout mEatOutFrame;
    private FrameLayout mWalkFrame;
    private FrameLayout mSportFrame;
    private FrameLayout mEventsFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEatOutFrame = (FrameLayout) findViewById(R.id.eat_out);
        mWalkFrame = (FrameLayout) findViewById(R.id.walk);
        mSportFrame = (FrameLayout) findViewById(R.id.sport);
        mEventsFrame = (FrameLayout) findViewById(R.id.events);

        mEatOutFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TriptargetActivity.class);
                intent.putExtra(TriptargetActivity.ARG_SECTION_NUMBER, 0);
                startActivity(intent);
            }
        });

        mWalkFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TriptargetActivity.class);
                intent.putExtra(TriptargetActivity.ARG_SECTION_NUMBER, 1);
                startActivity(intent);
            }
        });

        mSportFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TriptargetActivity.class);
                intent.putExtra(TriptargetActivity.ARG_SECTION_NUMBER, 2);
                startActivity(intent);
            }
        });

        mEventsFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TriptargetActivity.class);
                intent.putExtra(TriptargetActivity.ARG_SECTION_NUMBER, 3);
                startActivity(intent);
            }
        });
    }
}
