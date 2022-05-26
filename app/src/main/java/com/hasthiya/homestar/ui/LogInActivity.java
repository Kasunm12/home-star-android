package com.hasthiya.homestar.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.hasthiya.homestar.EditProfileActivity;
import com.hasthiya.homestar.R;
import com.hasthiya.homestar.api.ApiClient;
import com.hasthiya.homestar.api.ApiServices;
import com.hasthiya.homestar.dto.LoginResponseDTO;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LogInActivity extends AppCompatActivity {

    ApiServices apiServices;
    private EditText editTextTextPersonName;
    private EditText editTextTextPassword;
    private Button button;

    private final String SALUDOS = "==========Hello from the other side==========";


    //    Button button;
    TextView forget;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);
        button = findViewById(R.id.button);


//        button =  findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                button.setEnabled(false);
//                Intent intent = new Intent(LogInActivity.this, EditProfileActivity.class);
//                startActivity(intent);
//
//
//            }
//        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                userLogin();

            }

            private void userLogin() {
                apiServices = ApiClient.getClient().create(ApiServices.class);
                String email = editTextTextPersonName.getText().toString().trim();
                String password = editTextTextPassword.getText().toString().trim();

                if(checkValidaciones(email, password)){
                    Call<LoginResponseDTO> call = apiServices.Login(email, password);

                    call.enqueue(new Callback<LoginResponseDTO>() {
                        @Override
                        public void onResponse(Call<LoginResponseDTO> call, Response<LoginResponseDTO> response) {
                            LoginResponseDTO res = response.body();

                            if (res != null){

                                Intent intent = new Intent(LogInActivity.this, EditProfileActivity.class);
                                intent.putExtra("LoginResponseDTO", SALUDOS);

                                startActivity(intent);

                                Toast.makeText(LogInActivity.this, "", Toast.LENGTH_SHORT).show();
                            }else{

                                Toast.makeText(LogInActivity.this, "==========Error  login==========", Toast.LENGTH_LONG).show();
                            }
                        }

                        @Override
                        public void onFailure(Call<LoginResponseDTO> call, Throwable t) {
                            
                            Toast.makeText(LogInActivity.this, "========Error request========", Toast.LENGTH_LONG).show();
                        }

                    });
                }

                
            }

            private boolean checkValidaciones(String email, String password) {

                return false;
            }
        });


        forget =  findViewById(R.id.forget);
        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LogInActivity.this, ForgetPasswordActivity.class);
                startActivity(intent);
            }
        });
    }


}