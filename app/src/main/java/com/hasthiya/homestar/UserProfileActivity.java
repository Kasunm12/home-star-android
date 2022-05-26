package com.hasthiya.homestar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserProfileActivity extends AppCompatActivity {

    Button profileSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        profileSave =  findViewById(R.id.profileSave);
        profileSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserProfileActivity.this, ChooseInterestsActivity.class);
                startActivity(intent);
            }
        });
    }
}