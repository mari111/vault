package com.creator.mgi.vault_innovagic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;


public class vault extends AppCompatActivity {

    private GestureDetectorCompat gestureObject;
    MediaPlayer sound;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vault);

        gestureObject = new GestureDetectorCompat(this,new LearnGesture());
        sound = MediaPlayer.create(vault.this,R.raw.so);

    }





    public boolean onTouchEvent(MotionEvent event) {
        this.gestureObject.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
        class LearnGesture extends GestureDetector.SimpleOnGestureListener{

        //SImpleOnGestureListure is Lister for what we want to do and how


            // now putting the required code for gesture side by side


            @Override


                public boolean onFling(MotionEvent event1,MotionEvent event2, float velocityX,float velocityY) {
                if(event2.getX() > event1.getX()){


                    Intent intent = new Intent(vault.this, Swipe.class);
                    finish();


                    startActivity(intent);
                    if(sound.isPlaying()){
                        sound.pause();
                    }

                }
                else if(event2.getX()<event1.getX()){

                    //same on opposite direction u can add and another activity to open

                    sound.start();
                }


            return true;
        }

}}


