package com.example.programmer.customnavigationdrawer;

/**
 * Created by programmer on 27/6/15.
 */
public class ListingRowItem {


    private String listing_title;
    private int listing_image;
    private int listing_gold;
    private int listing_wishlist;
    private String listing_subtitle;

    private String listing_count;
    private String listing_redeem;
    private String listing_redeemed;

    public ListingRowItem(String listing_title, int listing_image, int listing_gold, int listing_wishlist, String listing_subtitle, String listing_count, String listing_redeem, String listing_redeemed) {
        this.listing_title = listing_title;
        this.listing_image = listing_image;
        this.listing_gold = listing_gold;
        this.listing_wishlist = listing_wishlist;
        this.listing_subtitle = listing_subtitle;
        this.listing_count = listing_count;
        this.listing_redeem = listing_redeem;
        this.listing_redeemed = listing_redeemed;
    }

    public String getListing_title() {
        return listing_title;
    }

    public void setListing_title(String listing_title) {
        this.listing_title = listing_title;
    }

    public int getListing_image() {
        return listing_image;
    }

    public void setListing_image(int listing_image) {
        this.listing_image = listing_image;
    }

    public int getListing_gold() {
        return listing_gold;
    }

    public void setListing_gold(int listing_gold) {
        this.listing_gold = listing_gold;
    }

    public int getListing_wishlist() {
        return listing_wishlist;
    }

    public void setListing_wishlist(int listing_wishlist) {
        this.listing_wishlist = listing_wishlist;
    }

    public String getListing_subtitle() {
        return listing_subtitle;
    }

    public void setListing_subtitle(String listing_subtitle) {
        this.listing_subtitle = listing_subtitle;
    }

    public String getListing_count() {
        return listing_count;
    }

    public void setListing_count(String listing_count) {
        this.listing_count = listing_count;
    }

    public String getListing_redeem() {
        return listing_redeem;
    }

    public void setListing_redeem(String listing_redeem) {
        this.listing_redeem = listing_redeem;
    }

    public String getListing_redeemed() {
        return listing_redeemed;
    }

    public void setListing_redeemed(String listing_redeemed) {
        this.listing_redeemed = listing_redeemed;
    }
}
