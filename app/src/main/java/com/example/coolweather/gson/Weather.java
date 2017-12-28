package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.net.PortUnreachableException;
import java.security.PublicKey;
import java.util.List;

/**
 * 项目名称：
 * 类描述：
 * 创建人：
 * 创建时间：
 * 修改人：
 * 修改时间：
 * 修改备注：
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public  Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
