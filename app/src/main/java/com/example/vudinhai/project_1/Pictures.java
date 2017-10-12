package com.example.vudinhai.project_1;

/**
 * Created by vudinhai on 10/12/17.
 */

public class Pictures {
    int image;
    String text;

    public Pictures(int image, String text) {
        this.image = image;
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
