package com.example.admin.w4d4login;

import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private TextInputLayout mTilUsername;
    private TextInputLayout mTilPassword;
    private EditText mUsername;
    private EditText mPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTilUsername = (TextInputLayout) findViewById(R.id.til_username);
        mTilPassword = (TextInputLayout) findViewById(R.id.til_password);

        mUsername = (EditText) findViewById(R.id.et_username);
        mPassword = (EditText) findViewById(R.id.et_password);
    }

    public void loginPorcess(View view) {
        boolean loginSuccess = true;
        if(mUsername.getText().toString().length() < 3){
            mTilUsername.setError("Oh my god... what is going on");
            loginSuccess = false;
        }else{
            mTilUsername.setErrorEnabled(false);
        }
        if(mPassword.getText().toString().length() == 0){
            mTilPassword.setError("Cannot be empty");
            loginSuccess = false;
        }else{
            mTilPassword.setErrorEnabled(false);

        }
        if(loginSuccess){
            Snackbar.make(view, "Logged in Succesfuly", Snackbar.LENGTH_LONG).show();
        }
    }
}
