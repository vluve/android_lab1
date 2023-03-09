package com.vluve.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.w("DEBUG:", "MainActivity onCreate() called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button detailsButton = (Button) findViewById(R.id.detail_activity_button);
        detailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DetailButtonClicked();
            }
        });

        Button websiteButton = (Button) findViewById(R.id.website_button);
        websiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebsiteButtonClicked();
            }
        });
    }

    @Override
    protected void onStart() {
        Log.w("DEBUG:", "MainActivity onStart() called");
        super.onStart();
        // The activity is about to become visible.
    }
    @Override
    protected void onResume() {
        Log.w("DEBUG:", "MainActivity onResume() called");
        super.onResume();
        // The activity has become visible (it is now "resumed").
    }
    @Override
    protected void onPause() {
        Log.w("DEBUG:", "MainActivity onPause() called");
        super.onPause();
        // Another activity is taking focus (this activity is about to be "paused").
    }
    @Override
    protected void onStop() {
        Log.w("DEBUG:", "MainActivity onStop() called");
        super.onStop();
        // The activity is no longer visible (it is now "stopped")
    }
    @Override
    protected void onDestroy() {
        Log.w("DEBUG:", "MainActivity onDestroy() called");
        super.onDestroy();
        // The activity is about to be destroyed.
    }


    protected void DetailButtonClicked() {
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }

    protected void WebsiteButtonClicked() {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.google.com"));
        startActivity(intent);
    }
}