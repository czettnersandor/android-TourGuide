package com.czettner.tourguide;

public class Triptarget {
    protected String mName;

    protected int mImageResource;
    protected String mDescription;

    public Triptarget(String name, String description, int imageResource) {
        mName = name;
        mDescription = description;
        mImageResource = imageResource;
    }

    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getImageResource() {
        return mImageResource;
    }
}
