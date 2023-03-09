package com.vluve.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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