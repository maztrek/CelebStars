package com.example.maztec.celebstars.Pojodata;

public class actorsrcs {

    private String id;
    private String cat_name;
    private String cat_img;

    public actorsrcs(String id, String cat_name, String cat_img) {
        this.id = id;
        this.cat_name = cat_name;
        this.cat_img = cat_img;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    public String getCat_img() {
        return cat_img;
    }

    public void setCat_img(String cat_img) {
        this.cat_img = cat_img;
    }
}
