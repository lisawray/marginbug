package com.example.marginbug;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.with_placeholders);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.load(this, R.layout.placeholders);
        constraintSet.applyTo(constraintLayout);
    }
}
