package com.mah.design_patterns.creational.prototype.domain.item;

public abstract class Item implements Cloneable {
    private String title;
    private double price;
    private String url;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
