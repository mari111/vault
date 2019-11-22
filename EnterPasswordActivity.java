package com.creator.mgi.vault_innovagic;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EnterPasswordActivity extends AppCompatActivity {
    EditText editText2;
    Button btn;
    String password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_password);

        SharedPreferences setting = getSharedPreferences("PREFS", 0);
        password = setting.getString("password", "");

        editText2= (EditText) findViewById(R.id.editText2);
        btn = (Button) findViewById(R.id.Btn2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = editText2.getText().toString();

                if(text.equals(password)) {
                    Intent intent = new Intent(getApplicationContext(), vault.class);
                    startActivity(intent);
                    finish();
                }
                else{
                    Toast.makeText(EnterPasswordActivity.this, "Worng Password" , Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}
