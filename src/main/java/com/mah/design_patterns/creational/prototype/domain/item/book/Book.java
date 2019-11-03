package com.mah.design_patterns.creational.prototype.domain.item.book;

import com.mah.design_patterns.creational.prototype.domain.item.Item;

public class Book extends Item {
    private int numberOfPages;

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
