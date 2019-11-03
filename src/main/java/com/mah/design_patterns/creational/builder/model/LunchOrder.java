package com.mah.design_patterns.creational.builder.model;

public class LunchOrder {
    public static class Builder {
        String bread;
        String condiments;
        String dressing;
        String meat;

        public Builder() {}

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

        public Builder copy(LunchOrder lunchOrder) {
            bread = lunchOrder.bread;
            condiments = lunchOrder.condiments;
            dressing = lunchOrder.dressing;
            meat = lunchOrder.meat;
            return this;
        }

        public LunchOrder build() {
            return new LunchOrder(this);
        }
    }

    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    private LunchOrder(Builder builder) {
        bread = builder.bread;
        condiments = builder.condiments;
        dressing = builder.dressing;
        meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

}
