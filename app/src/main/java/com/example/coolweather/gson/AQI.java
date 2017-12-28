package com.example.coolweather.gson;

/**
 * 项目名称：
 * 类描述：
 * 创建人：
 * 创建时间：
 * 修改人：
 * 修改时间：
 * 修改备注：
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
