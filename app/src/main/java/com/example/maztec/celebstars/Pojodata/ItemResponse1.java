package com.example.maztec.celebstars.Pojodata;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ItemResponse1 {
    @SerializedName("data")
    private List<HeaderData>data;

    public ItemResponse1(List<HeaderData> hdata) {
        this.data = hdata;
    }

    public List<HeaderData> getHdata() {
        return data;
    }

    public void setHdata(List<HeaderData> hdata) {
        this.data = hdata;
    }
}
