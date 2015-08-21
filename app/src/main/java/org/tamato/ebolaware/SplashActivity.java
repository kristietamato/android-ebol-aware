package org.tamato.ebolaware;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Delay the splash screen for 3 seconds.

        Runnable runnable3secs = new Runnable()
        {
            @Override
            public void run()
            {
                nextActivity();
            }
        };

        Handler myHandler = new Handler();
        myHandler.postDelayed(runnable3secs, 3000);
    }

    // Start the MainActivity.
    public void nextActivity()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
