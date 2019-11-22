package com.creator.mgi.vault_innovagic;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.vincent.filepicker.Constant;
import com.vincent.filepicker.filter.entity.ImageFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import static com.vincent.filepicker.activity.VideoPickActivity.IS_NEED_CAMERA;

public class Swipe extends AppCompatActivity {

    TextView textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);


        textView2 = (TextView) findViewById(R.id.textView2);

    }

    public void Viewimage1(View view) {


        Intent myIntent = new Intent(getBaseContext(),   openImages.class);
        startActivityForResult(myIntent, 1);







    }
}

