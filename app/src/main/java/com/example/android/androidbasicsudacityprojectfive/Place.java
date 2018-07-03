package com.example.android.androidbasicsudacityprojectfive;

/**
 * {@link Place} represents a point of interest that the user wants to learn about.
 * It contains resource IDs for the name, description, and
 * optional image file for that place.
 */
public class Place {

    /** String resource ID for the place name */
    private int mPlaceNameId;

    /** String resource ID for the place details */
    private int mPlaceDetailsId;

    /** Image resource ID for the place */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this place */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Place object.
     *
     * @param placeNameId is the string resource ID for the place name
     * @param placeDetailsId is the string resource Id for the place details
     */
    public Place(int placeNameId, int placeDetailsId) {
        mPlaceNameId = placeNameId;
        mPlaceDetailsId = placeDetailsId;
    }

    /**
     * Create a new Place object.
     *
     * @param placeNameId is the string resource ID for the place name
     * @param placeDetailsId is the string resource Id for the place details
     * @param imageResourceId is the drawable resource ID for the image associated with the place
     */
    public Place(int placeNameId, int placeDetailsId, int imageResourceId) {
        mPlaceNameId = placeNameId;
        mPlaceDetailsId = placeDetailsId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the place name.
     */
    public int getPlaceNameId() {
        return mPlaceNameId;
    }

    /**
     * Get the string resource ID for the place details.
     */
    public int getPlaceDetailsId() {
        return mPlaceDetailsId;
    }

    /**
     * Return the image resource ID of the place.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this place.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}