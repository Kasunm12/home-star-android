package com.hasthiya.homestar.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RegisterResponseSubSubDTO {

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("userName")
    @Expose
    private String userName;

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("language")
    @Expose
    private String language;

    @SerializedName("image")
    @Expose
    private String image;

    @SerializedName("points")
    @Expose
    private String points;
}
