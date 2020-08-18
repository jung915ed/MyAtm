package com.example.myatm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText edUser;
    private EditText edPasswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edUser = findViewById(R.id.userid);
        edPasswd = findViewById(R.id.passwd);
    }

    public void login(View view) {
        String userid = edUser.getText().toString();
        String passwd = edPasswd.getText().toString();
        if ("jack".equals(userid) && "1234".equals(passwd)) {
            setResult(RESULT_OK);
            finish();
        }
    }

    public void quit(View view) {

    }
}