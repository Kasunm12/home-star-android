package com.hasthiya.homestar.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ForgetPasswordResponseDTO {


    @SerializedName("code")
    @Expose
    private int code;

    @SerializedName("success")
    @Expose
    private boolean success;

    @SerializedName("data")
    @Expose
    private String data;
}
