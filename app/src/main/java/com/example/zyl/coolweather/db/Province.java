package com.example.zyl.coolweather.db;

import org.litepal.crud.DataSupport;


/**
 * Created by zyl on 2017/4/6.
 */

public class Province extends DataSupport {
    private int id;
    private int provinceCode;
    private String provinceName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPovinceCode() {
        return provinceCode;
    }

    public void setPovinceCode(int povinceCode) {
        this.provinceCode = povinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
