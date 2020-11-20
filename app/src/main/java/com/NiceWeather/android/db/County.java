package com.NiceWeather.android.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;
    private  String countNAme;
    private  String weatherId;
    private int cityId;

    public int getId(){
        return  id;
    }
    public  void setId(int id){
        this.id = id;
    }

    public String getCountNAme(){
        return  countNAme;
    }
    public  void setCountNAme(String countNAme){
        this.countNAme = countNAme;
    }

    public String getWeatherId(){
        return  weatherId;
    }
    public  void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }
    public int getCityId(){
        return  cityId;
    }
    public  void setCityId(int cityId){
        this.cityId = cityId;
    }

}
