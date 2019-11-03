package com.mah.design_patterns.creational.prototype.domain.item.movie;

import com.mah.design_patterns.creational.prototype.domain.item.Item;

public class Movie extends Item {
    private String runtime;

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }
}
