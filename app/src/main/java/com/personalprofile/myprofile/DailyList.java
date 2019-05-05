package com.personalprofile.myprofile;

public class DailyList {
    private String DailyName;

    // Save car image resource id.
    private int DailyImageId;

    public DailyList(String DailyName, int DailyImageId) {
        this.DailyName = DailyName;
        this.DailyImageId = DailyImageId;
    }

    public String getDailyName() {
        return DailyName;
    }

    public void setDailyName(String DailyName) {
        this.DailyName = DailyName;
    }

    public int getDailyImageId() {
        return DailyImageId;
    }

    public void setDailyImageId(int DailyImageId) {
        this.DailyImageId = DailyImageId;
    }
}
