package org.smoothstack.selfidrectedlearning.javabasics4.assignment2;

import java.util.concurrent.locks.Lock;

public class Runnable1 implements Runnable {

    private Lock lock1 = null;
    private Lock lock2 = null;

    public Runnable1(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        System.out.println(threadName + " locking Lock1");
        this.lock1.lock();
        System.out.println(threadName + " locked Lock1");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            // { ... }
        }

        System.out.println(threadName + " locking Lock2");
        this.lock2.lock();
        System.out.println(threadName + " locked Lock2");

        // { ... }

        System.out.println(threadName + " unlocking Lock1");
        this.lock2.unlock();
        System.out.println(threadName + " unlocking Lock2");
        this.lock2.unlock();
    }
}
