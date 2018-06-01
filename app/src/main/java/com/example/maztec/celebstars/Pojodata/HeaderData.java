package com.example.maztec.celebstars.Pojodata;

public class HeaderData {

    private String id;
    private String cat_name;
    private String cat_image;

    public HeaderData(String id, String cat_name, String cat_image) {
        this.id = id;
        this.cat_name = cat_name;
        this.cat_image = cat_image;
    }

    public String getId() {
        return id;
    }

    public String getCat_name() {
        return cat_name;
    }

    public String getCat_image() {
        return cat_image;
    }
}
