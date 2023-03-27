package com.example.models;

public class Dictionary {
    private String en;
    private String vn;

    public Dictionary() {
    }

    public Dictionary(String en, String vn) {
        this.en = en;
        this.vn = vn;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }
}
