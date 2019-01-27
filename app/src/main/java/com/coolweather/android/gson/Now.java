package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    @SerializedName("fl")
    public int feelTemperature;
    // 温度，摄氏度
    @SerializedName("tmp")
    public int temperature;
    // 实况天气状况代码
    @SerializedName("cond_code")
    public int conditionCode;
    // 实况天气状况描述
    @SerializedName("cond_txt")
    public String conditionTxt;
    // 风向
    @SerializedName("windDir")
    public String windDirection;
    // 风力
    @SerializedName("humidity")
    public int hum;
    @SerializedName("pcpn")
    public int precipitation;
    @SerializedName("wind_sc")
    public int windSource;
    // 风速，公里/小时
    @SerializedName("")
    public int windSpeed;
    // 大气压强
    @SerializedName("pres")
    public int pressure;
    // 能见度 公里
    @SerializedName("vis")
    public int visibility;
    // 云量
    @SerializedName("cloud")
    public int cloudCover;
}
