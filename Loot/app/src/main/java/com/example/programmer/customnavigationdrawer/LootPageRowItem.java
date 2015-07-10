package com.example.programmer.customnavigationdrawer;

/**
 * Created by BinaryArrows on 4/27/2015.
 */
public class LootPageRowItem {

    private String title;
    private int icon;
    private String offer;
    private String redeem;
    private String expire;


    public LootPageRowItem(String title, int icon, String offer, String redeem, String expire) {
        this.title = title;
        this.icon = icon;
        this.offer=offer;
        this.redeem=redeem;
        this.expire=expire;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIcon() {
        return icon;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public String getRedeem() {
        return redeem;
    }

    public void setRedeem(String redeem) {
        this.redeem = redeem;
    }

    public String getExpire() {
        return expire;
    }

    public void setExpire(String expire) {
        this.expire = expire;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

}