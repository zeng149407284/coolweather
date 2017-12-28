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

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
