package com.hasthiya.homestar.api;

import com.hasthiya.homestar.dto.ForgetPasswordRequestDTO;
import com.hasthiya.homestar.dto.ForgetPasswordResponseDTO;
import com.hasthiya.homestar.dto.LoginRequestDTO;
import com.hasthiya.homestar.dto.LoginResponseDTO;
import com.hasthiya.homestar.dto.RegisterRequestDTO;
import com.hasthiya.homestar.dto.RegisterResponseDTO;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiServices {

    @FormUrlEncoded
    @GET("login/{email}/{password}")
    Call<LoginResponseDTO> login(
            @Path("email") String email,
            @Path("password") String password
    );

    @Headers({"Accept: application/json"})
    @POST("user/AddUser")
    Call<RegisterResponseDTO> AddUser(@Body RegisterRequestDTO registerRequestDTO);

//    @Headers({"Accept: application/json"})
//    @POST("user/Login")
//    Call<LoginResponseDTO> Login(@Body LoginRequestDTO loginRequestDTO);

    @Headers({"Accept: application/json"})
    @POST("user/forgotpassword")
    Call<ForgetPasswordResponseDTO> forgotpassword(@Body ForgetPasswordRequestDTO forgetPasswordRequestDTO);

    @Headers({"Accept: application/json"})
    @POST("user/Login")
    Call<LoginResponseDTO> Login(String email, String password);
}
