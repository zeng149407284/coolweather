package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 项目名称：
 * 类描述：
 * 创建人：
 * 创建时间：
 * 修改人：
 * 修改时间：
 * 修改备注：
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String min;
        public String max;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
