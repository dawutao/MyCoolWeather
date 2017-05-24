package com.mycoolweather.android.gson;

/**
 * Created by wutao on 2017/05/24.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
