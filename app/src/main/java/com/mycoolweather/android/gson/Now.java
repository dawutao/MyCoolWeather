package com.mycoolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wutao on 2017/05/24.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String Info;
    }
}
