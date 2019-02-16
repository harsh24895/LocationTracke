package com.example.locationtracker;

import android.net.Uri;
import android.provider.BaseColumns;

import java.net.URI;

public class PlaceContract {

    public static final String AUTHORITY="com.example.android.LocationTracker";

    public static final Uri BASE_CONTENT_URI= Uri.parse("content://"+ AUTHORITY);


    public  static final String PATH_PLACES="places";

    public static final class PlaceEntry implements BaseColumns
    {
        public static final Uri CONTENT_URI=BASE_CONTENT_URI.buildUpon().appendPath(PATH_PLACES).build();

        public static final String TABLE_NAME="places";
        public static final String COLUMN_PLACE_ID="placeID";
    }}
