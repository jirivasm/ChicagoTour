package com.example.chicagotour;

public class Place {

    private String mName;
    private String mAddress;
    private String mPhone;
    private int mImageID;
    boolean hasImage = false;

//constructor wuthout image
    Place(String name, String address, String phone) {
        mName = name;
        mAddress = address;
        mPhone = phone;
        hasImage = false;
    }
    //constructor with image
    Place(String name, String address, int imageID) {
        mName = name;
        mAddress = address;
        mImageID = imageID;
        hasImage = true;
    }
    //getters function
    public String getName(){
        return mName;
    }
    public void setName(String newName)
    {
        mName = newName;
    }

    public String getAddress(){
        return mAddress;
    }
    public void setAddress(String newAddress)
    {
        mAddress = newAddress;
    }

    public String getPhone(){
        return mPhone;
    }
    public void setPhone(String newPhone)
    {
        mPhone = newPhone;
    }

    public int getImage(){
        return mImageID;
    }
    public void setImage(int newImage)
    {
        mImageID = newImage;
    }



}
