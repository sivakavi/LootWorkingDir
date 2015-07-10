package com.example.programmer.customnavigationdrawer;

/**
 * Created by programmer on 13/5/15.
 */
public class WishlistRowItem {


    private String wishlist_title;
    private int wishlist_image;
    private int wishlist_gold;
    private int wishlist_close;
    private String wishlist_subtitle;
    private String wishlist_days;
    private String wishlist_count;
    private String wishlist_redeem;
    private String wishlist_redeemed;



    public WishlistRowItem(String wishlist_title, int wishlist_image, int wishlist_gold, int wishlist_close, String wishlist_subtitle, String wishlist_days, String wishlist_count, String wishlist_redeem, String wishlist_redeemed) {
        this.wishlist_title = wishlist_title;
        this.wishlist_image = wishlist_image;
        this.wishlist_gold = wishlist_gold;
        this.wishlist_close = wishlist_close;
        this.wishlist_subtitle = wishlist_subtitle;
        this.wishlist_days = wishlist_days;
        this.wishlist_count = wishlist_count;
        this.wishlist_redeem=wishlist_redeem;
        this.wishlist_redeemed=wishlist_redeemed;
    }

    public String getWishlist_title() {
        return wishlist_title;
    }

    public void setWishlist_title(String wishlist_title) {
        this.wishlist_title = wishlist_title;
    }

    public int getWishlist_image() {
        return wishlist_image;
    }

    public void setWishlist_image(int wishlist_image) {
        this.wishlist_image = wishlist_image;
    }

    public int getWishlist_gold() {
        return wishlist_gold;
    }

    public void setWishlist_gold(int wishlist_gold) {
        this.wishlist_gold = wishlist_gold;
    }

    public int getWishlist_close() {
        return wishlist_close;
    }

    public void setWishlist_close(int wishlist_close) {
        this.wishlist_close = wishlist_close;
    }

    public String getWishlist_subtitle() {
        return wishlist_subtitle;
    }

    public void setWishlist_subtitle(String wishlist_subtitle) {
        this.wishlist_subtitle = wishlist_subtitle;
    }

    public String getWishlist_days() {
        return wishlist_days;
    }

    public void setWishlist_days(String wishlist_days) {
        this.wishlist_days = wishlist_days;
    }

    public String getWishlist_count() {
        return wishlist_count;
    }

    public void setWishlist_count(String wishlist_count) {
        this.wishlist_count = wishlist_count;
    }

    public String getWishlist_redeem() {
        return wishlist_redeem;
    }

    public void setWishlist_redeem(String wishlist_redeem) {
        this.wishlist_redeem = wishlist_redeem;
    }

    public String getWishlist_redeemed() {
        return wishlist_redeemed;
    }

    public void setWishlist_redeemed(String wishlist_redeemed) {
        this.wishlist_redeemed = wishlist_redeemed;
    }
}
