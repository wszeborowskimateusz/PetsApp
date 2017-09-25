package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by Mateusz on 25/09/2017.
 */

public final class PetContract {

    private PetContract(){}

    /* Inner class that defines the table contents */
    public static class PetEntry implements BaseColumns {

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
    }

}
