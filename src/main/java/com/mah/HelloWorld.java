package com.mah;

import com.mah.design_patterns.creational.builder.model.LunchOrder;
import com.mah.design_patterns.creational.singleton.DbSingleton;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        DbSingleton instance = DbSingleton.getInstance();

        System.out.println(instance);

        DbSingleton anotherInstance = DbSingleton.getInstance();

        System.out.println(anotherInstance);

        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
