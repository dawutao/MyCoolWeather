package com.mycoolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wutao on 2017/05/24.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;


    @SerializedName("cond")
    public More more;

    public class Temperature
    {
        public String max;
        public String min;
    }

    public class More
    {
        @SerializedName("txt_id")
        public String info;
    }
}
