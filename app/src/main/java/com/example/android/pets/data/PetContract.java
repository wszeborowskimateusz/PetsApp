package com.example.android.pets.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by Mateusz on 25/09/2017.
 */

public final class PetContract {

    /*The content authority to form proper URI*/
    public static final String CONTENT_AUTHORITY = "com.example.android.pets";

    /*The base URI to talk to the ContentProvider*/
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    /*This constants stores the path for each of the tables which will be appended to the base content URI.*/
    public static final String PATH_PETS = "pets";



    private PetContract(){}

    /* Inner class that defines the table contents */
    public static class PetEntry implements BaseColumns {

        //The content URI to access the pet data in the provider
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

        //The name of the table
        public static final String TABLE_NAME = "pets";

        //the id column
        public static final String _ID = BaseColumns._ID;

        //the name column
        public static final String COLUMN_PET_NAME = "name";

        //the breed column
        public static final String COLUMN_PET_BREED = "breed";

        //the gender column
        public static final String COLUMN_PET_GENDER = "gender";

        //the weight column
        public static final String COLUMN_PET_WEIGHT = "weight";

        //Unknown gender
        public static final int GENDER_UNKNOWN = 0;

        //Male gender
        public static final int GENDER_MALE = 1;

        //Female gender
        public static final int GENDER_FEMALE = 2;

        /**
         * The MIME type of the {@link #CONTENT_URI} for a list of pets.
         */
        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;

        /**
         * The MIME type of the {@link #CONTENT_URI} for a single pet.
         */
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;

    }

}
