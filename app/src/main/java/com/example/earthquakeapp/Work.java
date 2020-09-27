package com.example.earthquakeapp;

public class Work {
    Double mag;
        String    loc;
    long Date;
    private  String nurl;
    public Work(Double mag,String loc, long Date,String url){
        this.mag=mag;
        this.loc=loc;
        this.Date=Date;
        nurl=url;
    }
    public Double getmag(){
        return mag;
    }
    public String getloc(){
        return loc;

    }
    public long getDate(){
        return Date;
    }
    public String getUrl() {
        return nurl;
    }
}
