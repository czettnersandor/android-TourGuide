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
    private FrameLayout mEvents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEatOutFrame = (FrameLayout) findViewById(R.id.eat_out);
        mWalkFrame = (FrameLayout) findViewById(R.id.walk);
        mSportFrame = (FrameLayout) findViewById(R.id.sport);
        mEvents = (FrameLayout) findViewById(R.id.events);

        mEatOutFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TriptargetActivity.class);
                //intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }
        });
    }
}
