package com.vluve.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.w("DEBUG:", "DetailActivity onCreate() called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView laptopsButton = (ImageView) findViewById(R.id.laptops_button);
        laptopsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LaptopsButtonClicked();
            }
        });
    }

    @Override
    protected void onStart() {
        Log.w("DEBUG:", "DetailActivity onStart() called");
        super.onStart();
        // The activity is about to become visible.
    }
    @Override
    protected void onResume() {
        Log.w("DEBUG:", "DetailActivity onResume() called");
        super.onResume();
        // The activity has become visible (it is now "resumed").
    }
    @Override
    protected void onPause() {
        Log.w("DEBUG:", "DetailActivity onPause() called");
        super.onPause();
        // Another activity is taking focus (this activity is about to be "paused").
    }
    @Override
    protected void onStop() {
        Log.w("DEBUG:", "DetailActivity onStop() called");
        super.onStop();
        // The activity is no longer visible (it is now "stopped")
    }
    @Override
    protected void onDestroy() {
        Log.w("DEBUG:", "DetailActivity onDestroy() called");
        super.onDestroy();
        // The activity is about to be destroyed.
    }

    protected void LaptopsButtonClicked() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

