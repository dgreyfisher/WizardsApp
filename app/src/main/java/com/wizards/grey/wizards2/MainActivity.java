package com.wizards.grey.wizards2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;


public class MainActivity extends ActionBarActivity {

    Random rnd = new Random();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get a random image for the Main Page

        ImageView img = (ImageView) findViewById(R.id.imgRandom);
        // I have 3 images named img_0 to img_2, so...
        String str = "img_" + rnd.nextInt(3);
        img.setImageDrawable
                (
                        getResources().getDrawable(getResourceID(str, "drawable", getApplicationContext()))
                );

        //Set Up Main Page Buttons

        Button startBtn = (Button) findViewById(R.id.startBtn);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WizardActivity.class);
                startActivity(intent);
            }
        });

        Button howToPlayBtn = (Button) findViewById(R.id.howToPlayBtn);

        howToPlayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HelpActivity.class);
                startActivity(intent);
            }
        });

    }

    protected final static int getResourceID
            (final String resName, final String resType, final Context ctx) {
        final int ResourceID =
                ctx.getResources().getIdentifier(resName, resType,
                        ctx.getApplicationInfo().packageName);
        if (ResourceID == 0) {
            throw new IllegalArgumentException
                    (
                            "No resource string found with name " + resName
                    );
        } else {
            return ResourceID;
        }

    }
}