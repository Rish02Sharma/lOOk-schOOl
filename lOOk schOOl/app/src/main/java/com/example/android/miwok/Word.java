package com.example.android.miwok;

/**
 * Created by rishabh on 19/5/17.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    /** Image resource ID for the word */
    private int imageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word (String defaultTranslation , String miwokTranslation )
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
    }

    public Word (String defaultTranslation , String miwokTranslation , int resourceID )
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        imageResourceId=resourceID;
    }

    public String getDefault(){

        return mDefaultTranslation;
    }


    public String getmiwok(){

        return mMiwokTranslation;
    }

    public int getImageResourceId(){

        return imageResourceId;

    }
    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}
