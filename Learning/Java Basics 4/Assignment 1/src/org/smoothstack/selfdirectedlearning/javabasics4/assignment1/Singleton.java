package org.smoothstack.selfdirectedlearning.javabasics4.assignment1;

public class Singleton {
    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    private Singleton() {
        // { ... }
    }
}
