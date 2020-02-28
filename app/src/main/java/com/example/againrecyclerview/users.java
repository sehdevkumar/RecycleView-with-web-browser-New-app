package com.example.againrecyclerview;

import android.graphics.drawable.Drawable;

public class users {

    private  int id;
    private  String text;
    private Drawable img;
    private  String url;

    public users(int id, String text, Drawable img,String url) {
        this.id = id;
        this.text = text;
        this.img = img;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Drawable getImg() {
        return img;
    }

    public String getUrl() {
        return url;
    }
}
