package com.example.macbookpro.tourguideapp;

/**
 * Created by macbookpro on 6/28/16.
 */
public class TourisAttraction {

    private String mNameAttraction;
    private String mAddressAttraction;
    private int mImageResourceId;
    //Constructor
    TourisAttraction(String mName, String mAddress, int mImage){
        mNameAttraction = mName;
        mAddressAttraction = mAddress;
        mImageResourceId = mImage;


    }


    //Getters
    public String getmAddressAttraction(){
        return mAddressAttraction;
    }
    public String getmNameAttraction(){
        return mNameAttraction;
    }
    public int getmImageResourceId(){
        return mImageResourceId;
    }

    //setters
    public void setmNameAttraction(String mNew){
        mNameAttraction = mNew;
    }
    public void setmAddressAttraction( String mNew){
        mAddressAttraction=mNew;
    }
    public void setmImageResourceId(int mNewImage){
        mImageResourceId=mNewImage;
    }
}
