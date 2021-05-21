package com.ck.entity;

import java.util.Date;

public class BookInfo {
    private int bid;
    private String bname;
    private double price;
    private  BookType bookType;
    private Date dtime;
    private String imgurl;
    private int state;

    public BookInfo(int bid, String bname, double price, BookType bookType, Date dtime, String imgurl, int state) {
        this.bid = bid;
        this.bname = bname;
        this.price = price;
        this.bookType = bookType;
        this.dtime = dtime;
        this.imgurl = imgurl;
        this.state = state;
    }

    public BookInfo() {
        super();
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public Date getDtime() {
        return dtime;
    }

    public void setDtime(Date dtime) {
        this.dtime = dtime;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
