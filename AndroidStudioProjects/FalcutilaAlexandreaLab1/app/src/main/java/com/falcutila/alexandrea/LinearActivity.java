package com.falcutila.alexandrea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LinearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);
    }

    public void onButtonClick(View v) {

        if (v.getId() == R.id.button2) {
            Intent i = new Intent(LinearActivity.this, RelativeActivity.class);
            startActivity(i);
        }
    }
}
