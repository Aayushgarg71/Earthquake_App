package com.example.earthquakeapp;

public class Work {
    String mag,loc;
    long Date;
    public Work(String mag,String loc, long Date){
        this.mag=mag;
        this.loc=loc;
        this.Date=Date;
    }
    public String getmag(){
        return mag;
    }
    public String getloc(){
        return loc;

    }
    public long getDate(){
        return Date;
    }
}
