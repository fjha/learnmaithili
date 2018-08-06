package android.application.flora.learnmaithili;

/**
 * Created by Flora on 3/29/2017.
 */

public class Word {private String mDefaultTranslation ;

    // Miwok  translation
    private String mEnglishTranslation ;
    private int    mImageResourceId =NO_IMAGE_PROVIDED ;
    private static final  int NO_IMAGE_PROVIDED =-1;

    public Word(String   DefaultTranslation  , String EnglishTranslation , int ImageResourceId)
    {
        mDefaultTranslation =DefaultTranslation ;
        mEnglishTranslation   =EnglishTranslation ;
        mImageResourceId    =ImageResourceId ;

    }

    public Word(String   DefaultTranslation  , String EnglishTranslation)
    {
        mDefaultTranslation =DefaultTranslation ;
        mEnglishTranslation   =EnglishTranslation ;

    }

    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public String getEnglishTranslation()
    {
        return  mEnglishTranslation;
    }
    public int getImageResourceId()
    {
        return mImageResourceId ;
    }
    public boolean hasImage()
    {
        return mImageResourceId !=NO_IMAGE_PROVIDED ;
    }


}
