package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
//    @SerializedName("city")
    @SerializedName("parent_city")
    public String parentCity;
    @SerializedName("admin_area")
    public String adminArea;
    @SerializedName("location")
    public String location;


    @SerializedName("lat")
    public String latitude;
    @SerializedName("lon")
    public String longitude;

    @SerializedName("cnty")
    public String countryName;



    @SerializedName("cid")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
