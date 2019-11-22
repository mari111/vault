package com.creator.mgi.vault_innovagic;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
String password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // load the password

        SharedPreferences setting = getSharedPreferences("PREFS", 0);
        password = setting.getString("password", "");

        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){

            public void run(){
                if(password.equals("")){

                    //if there is no password

                Intent intent = new Intent(getApplicationContext(), CreatePasswordActivity.class);
                startActivity(intent);
                finish();


            }else{

                    Intent intent = new Intent(getApplicationContext(), EnterPasswordActivity.class);
                    startActivity(intent);
                    finish();


                }


            }

        }, 2000);
    }
}
