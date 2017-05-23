package com.mycoolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by wutao on 2017/05/23.
 */

public class City extends DataSupport {

    private int id;

    private String cityName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }


    private int cityCode;

    public int getProvincecId() {
        return provincecId;
    }

    public void setProvincecId(int provincecId) {
        this.provincecId = provincecId;
    }

    private int provincecId;

}
