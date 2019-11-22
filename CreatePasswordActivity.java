package com.creator.mgi.vault_innovagic;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreatePasswordActivity extends AppCompatActivity {

    EditText editText1, editTextpass;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_password);
        editText1= (EditText) findViewById(R.id.editText1);
        editTextpass= (EditText) findViewById(R.id.editTextpass);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String text = editText1.getText().toString();
                String text1 = editTextpass.getText().toString();
                // there s no password

                    if(text.equals("") || text1.equals("")){
                        Toast.makeText(CreatePasswordActivity.this, "no password entered", Toast.LENGTH_SHORT).show();
                }
                else
                    {
                        // save passwords
                        if(text.equals(text1)){

                        SharedPreferences settings = getSharedPreferences("PREFS", 0);
                        SharedPreferences.Editor editor = settings.edit();
                        editor.putString("password", text);
                        editor.apply();

                        // enter the password

                        Intent intent = new Intent(getApplicationContext(), vault.class);
                        startActivity(intent);
                        finish();

                    }else{
                    // there is no match on the password
                            Toast.makeText(CreatePasswordActivity.this, "password does'nt match!", Toast.LENGTH_SHORT).show();
                        }


                    }

            }
        });

    }
}
