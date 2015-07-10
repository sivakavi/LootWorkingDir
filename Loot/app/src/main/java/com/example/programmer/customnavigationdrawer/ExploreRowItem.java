package com.example.programmer.customnavigationdrawer;

/**
 * Created by BinaryArrows on 4/27/2015.
 */
public class ExploreRowItem {

    private String title;
    private String subtitle;
    private int icon1;
    private int icon2;
    private int mainimage;
    private String redeemed;
    private String redeem;
    private String gold;


    public ExploreRowItem(String title, String subtitle, int mainimage, int iconA, int icon2, String gold, String redeem, String redeemed) {
        this.title = title;
        this.subtitle = subtitle;
        this.mainimage=mainimage;
        this.icon1=iconA;
        this.icon2=icon2;
        this.gold=gold;
        this.redeem=redeem;
        this.redeemed=redeemed;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getIcon1() {
        return icon1;
    }

    public void setIcon1(int icon1) {
        this.icon1 = icon1;
    }

    public int getIcon2() {
        return icon2;
    }

    public void setIcon2(int icon2) {
        this.icon2 = icon2;
    }

    public int getMainimage() {
        return mainimage;
    }

    public void setMainimage(int mainimage) {
        this.mainimage = mainimage;
    }

    public String getRedeemed() {
        return redeemed;
    }

    public void setRedeemed(String redeemed) {
        this.redeemed = redeemed;
    }

    public String getRedeem() {
        return redeem;
    }

    public void setRedeem(String redeem) {
        this.redeem = redeem;
    }

    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }
}