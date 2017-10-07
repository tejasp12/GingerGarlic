package com.example.android.gingergarlic;


public class Word {
    //Declare Instance variables for the class.
    private String mRestoName;
    private String mRestoCategory;
    private int mVegImageResourceID;
    private int mNonvegImageResourceID;
    //Define constructor for a class.
    public Word(String DefaultTranslation,String MiwokTranslation){
        mRestoName = DefaultTranslation;
        mRestoCategory = MiwokTranslation;
    }
    public Word(String restoName,String restoCategory,int ImageResourceID){
        mRestoName = restoName;
        mRestoCategory = restoCategory;
        mVegImageResourceID = ImageResourceID;
    }
    public Word(String restoName,String restoCategory,int vegImageResourceID,
                int nonvegImageResourceID){
        mRestoName = restoName;
        mRestoCategory = restoCategory;
        mVegImageResourceID = vegImageResourceID;
        mNonvegImageResourceID = nonvegImageResourceID;
    }
    //Declare public methods to access private variables.
    public String getRestoName(){
        return mRestoName;
    }
    public String getRestoCategory(){
        return mRestoCategory;
    }
    public int getVegImageResourceID(){
        return mVegImageResourceID;
    }
    public int getNonVegImageResourceID(){
        return mNonvegImageResourceID;
    }
}
