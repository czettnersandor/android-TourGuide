package com.czettner.tourguide;

public class Triptarget {
    protected String mName;
    protected int mImageResource;
    protected String mPhoneNumber;
    protected String mWebsite;
    protected String mDescription;

    public Triptarget(String name, int imageResource) {
        mName = name;
        mImageResource = imageResource;
    }

    public String getName() {
        return mName;
    }

    public void setPhoneNumber(String mPhoneNumber) {
        this.mPhoneNumber = mPhoneNumber;
    }

    public void setWebsite(String mWebsite) {
        this.mWebsite = mWebsite;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public String getWebsite() {
        return mWebsite;
    }

    public String getDescription() {
        return mDescription;
    }
}
