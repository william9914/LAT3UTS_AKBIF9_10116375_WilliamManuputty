package com.personalprofile.myprofile;

public class FriendView {

    private String F_Name;

    private int F_Image;

    public FriendView(String F_Name, int F_Image) {
        this.F_Name = F_Name;
        this.F_Image = F_Image;
    }

    public String getF_Name() {
        return F_Name;
    }

    public void setF_Name(String F_Name) {
        this.F_Name = F_Name;
    }

    public int getF_Image() {
        return F_Image;
    }

    public void setF_Image(int F_Image) {
        this.F_Image = F_Image;
    }
}