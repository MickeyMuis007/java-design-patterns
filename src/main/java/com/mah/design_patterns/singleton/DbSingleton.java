package com.mah.design_patterns.singleton;

public class DbSingleton {
    // Threadsafe: Use volatile to ensure instance remains singleton through any of the changes in the jvm.
    private static volatile DbSingleton instance = null;

    private DbSingleton() {
        // Threadsafe: Ensure no one to use reflection
        if (instance != null) {
            throw  new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingleton getInstance() {
        // This outer layer is not threadsafe, and if it's already not null we don't care if it's thread safe or not.
        if (instance == null) {
            synchronized(DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }
}
