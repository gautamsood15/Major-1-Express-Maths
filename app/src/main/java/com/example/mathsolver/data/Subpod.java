package com.example.mathsolver.data;

import com.google.gson.annotations.SerializedName;


public class Subpod {
    @SerializedName("img")
    private Image image;

    @SerializedName("plaintext")
    private String plainText;

    public Image getImage(){
        return image;
    }

    public String getPlainText(){
        return plainText;
    }

    @Override
    public int hashCode() {
        return (int) (31*((plainText.length()*5) + (image.getSourceLink().length() * 24)));
    }

    @Override
    public boolean equals(Object obj) {
        Subpod subpod = (Subpod) obj;
        return (this.image == subpod.image) && (this.plainText == subpod.plainText);
    }
}
