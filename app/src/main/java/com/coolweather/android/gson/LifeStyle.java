package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class LifeStyle {
    // 生活指数简介
    @SerializedName("brf")
    public String lifeBriefer;
    // 生活指数详细描述
    @SerializedName("txt")
    public String lifeTxt;
    @SerializedName("type")
    public String lifeType;
}
