package com.example.zyl.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zyl on 2017/4/6.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private int cityID;
    private int weatherID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public int getWeatherID() {
        return weatherID;
    }

    public void setWeatherID(int weatherID) {
        this.weatherID = weatherID;
    }
}
