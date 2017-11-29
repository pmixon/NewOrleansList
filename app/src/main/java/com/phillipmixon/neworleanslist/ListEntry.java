package com.phillipmixon.neworleanslist;

public class ListEntry {

    public void setmTextThreeId(int mTextThreeId) {
        this.mTextThreeId = mTextThreeId;
    }

    /** String resource ID for the first text option */
    private int mTextOneId;

    /** String resource ID for the second text option */
    private int mTextTwoId;

    /** String resource ID for the third text option */
    private int mTextThreeId;

    /** Audio resource ID for the word */
    private int mAudioResourceId;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    public ListEntry(int textOneId, int textTwoId, int textThreeId) {
        mTextOneId = textOneId;
        mTextTwoId = textTwoId;
        mTextThreeId = textThreeId;
    }

    public ListEntry(int textOneId, int textTwoId, int textThreeId, int audioResourceId) {
        mTextOneId = textOneId;
        mTextTwoId = textTwoId;
        mTextThreeId = textThreeId;
        mAudioResourceId = audioResourceId;
    }

    public ListEntry(int textOneId, int textTwoId, int textThreeId, int imageResourceId, int audioResourceId) {
        mTextOneId = textOneId;
        mTextTwoId = textTwoId;
        mTextThreeId = textThreeId;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public int getmTextOneId() {
        return mTextOneId;
    }

    public void setmTextOneId(int mTextOneId) {
        this.mTextOneId = mTextOneId;
    }

    public int getmTextTwoId() {
        return mTextTwoId;
    }

    public void setmTextTwoId(int mTextTwoId) {
        this.mTextTwoId = mTextTwoId;
    }

    public int getmTextThreeId() {
        return mTextThreeId;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}