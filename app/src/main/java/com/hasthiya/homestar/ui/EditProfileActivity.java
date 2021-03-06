package com.hasthiya.homestar.ui;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hasthiya.homestar.R;
import com.hasthiya.homestar.ui.UserProfileActivity;

public class EditProfileActivity extends AppCompatActivity {

    Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        save =  findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EditProfileActivity.this, UserProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}

