package com.example.maztec.celebstars.Pojodata;

import com.google.gson.annotations.SerializedName;

public class ItemResponse2 {
    @SerializedName("id")
    private String sid;

    @SerializedName("cat_img")
    private  String simages;

    @SerializedName("cat_name")
    private String snames;

    public ItemResponse2(String sid, String simages, String snames) {
        this.sid = sid;
        this.simages = simages;
        this.snames = snames;
    }

    public String getSid() {
        return sid;
    }

    public String getSimages() {
        return simages;
    }

    public String getSnames() {
        return snames;
    }
}
