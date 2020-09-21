package com.example.earthquakeapp;

public class Work {
    String mag,loc, Date;
    public Work(String mag,String loc, String Date){
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
    public String getDate(){
        return Date;
    }
}
