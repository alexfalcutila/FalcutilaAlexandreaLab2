package com.falcutila.alexandrea;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class RelativeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
    }

    public void onButtonClick(View v) {

        if (v.getId() == R.id.buttonnext) {
            Intent i = new Intent(RelativeActivity.this, ConstraintActivity.class);
            startActivity(i);
        }
    }
}
