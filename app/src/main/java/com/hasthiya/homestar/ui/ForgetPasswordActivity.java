package com.hasthiya.homestar.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hasthiya.homestar.R;

public class ForgetPasswordActivity extends AppCompatActivity {

    EditText ForgetEmail,subject,emailbody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        ForgetEmail = (EditText)findViewById(R.id.ForgetEmail);
        setTitle("Forgot Password");
        ForgetEmail.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                ForgetPasswordActivity.this.finish();
                Intent intent = new Intent();
                intent.setClass(v.getContext(), LogInActivity.class);
                startActivity(intent);

            }
            //Code For Sending mail

        });

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sendEmail();
            }

            private void sendEmail() {

                final Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
                emailIntent.setType("plain/text");
                emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"testmail@testmail.com"});
                emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, subject.getText());
                emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, emailbody.getText());
                ForgetPasswordActivity.this.startActivity(Intent.createChooser(emailIntent, "Send mail..."));

            }
        });



    }


}