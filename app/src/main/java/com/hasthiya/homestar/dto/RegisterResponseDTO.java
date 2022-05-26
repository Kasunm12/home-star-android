package com.hasthiya.homestar.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RegisterResponseDTO {

    @SerializedName("code")
    @Expose
    private int code;

    @SerializedName("success")
    @Expose
    private boolean success;

    @SerializedName("token")
    @Expose
    private RegisterResponseDTO token;

    @SerializedName("message")
    @Expose
    private String message;
}
