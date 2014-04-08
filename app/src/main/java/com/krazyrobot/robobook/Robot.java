package com.krazyrobot.robobook;

public class Robot {
    private String mName;
    private int mImgRes;

    public Robot(String name, int imageRes) {
        mName = name;
        mImgRes = imageRes;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmImgRes() {
        return mImgRes;
    }

    public void setmImgRes(int mImgRes) {
        this.mImgRes = mImgRes;
    }
}
