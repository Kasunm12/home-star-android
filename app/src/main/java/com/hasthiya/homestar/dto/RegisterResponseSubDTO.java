package com.hasthiya.homestar.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RegisterResponseSubDTO {

    @SerializedName("token")
    @Expose
    private String token;

    @SerializedName("expires")
    @Expose
    private boolean expires;

    @SerializedName("sub")
    @Expose
    private RegisterResponseSubSubDTO sub;
}
