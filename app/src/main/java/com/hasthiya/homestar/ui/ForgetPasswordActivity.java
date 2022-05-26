package com.hasthiya.homestar.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.hasthiya.homestar.R;

public class ForgetPasswordActivity extends AppCompatActivity {

    EditText ForgetEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        setTitle("Forgot Password");
    }

}