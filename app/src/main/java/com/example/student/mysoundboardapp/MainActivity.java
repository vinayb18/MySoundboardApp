package com.example.student.mysoundboardapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set up the button sound

        final MediaPlayer mpvoice006 = MediaPlayer.create(this, R.raw.voice_006);

        Button firstSound = (Button) findViewById(R.id.firstSound);

        firstSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpvoice006.start();
            }
        });

        //set up the button sound

        final MediaPlayer mpvoice001 = MediaPlayer.create(this, R.raw.voice_001);

        Button secondSound = (Button) findViewById(R.id.secondSound);

        secondSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpvoice001.start();
            }
        });

        //set up the button sound

        final MediaPlayer mpvoice002 = MediaPlayer.create(this, R.raw.voice_002);

        Button thirdSound = (Button) findViewById(R.id.thirdSound);

        thirdSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpvoice002.start();
            }
        });

          //set up the button sound

        final MediaPlayer mpvoice003 = MediaPlayer.create(this, R.raw.voice_003);

        Button fourthSound = (Button) findViewById(R.id.fourthSound);

        fourthSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpvoice003.start();
            }
        });

        //set up the button sound

        final MediaPlayer mpvoice004 = MediaPlayer.create(this, R.raw.voice_004);

        Button fifthSound = (Button) findViewById(R.id.fifthSound);

        fifthSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpvoice004.start();
            }
        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
