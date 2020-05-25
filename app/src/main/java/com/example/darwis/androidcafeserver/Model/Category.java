package com.example.darwis.androidcafeserver.Model;

/**
 * Created by Darwis on 10/16/2018.
 */

public class Category {
    private String Name;
    private String Image;

    public Category() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public Category(String name, String image) {

        Name = name;
        Image = image;
    }
}
