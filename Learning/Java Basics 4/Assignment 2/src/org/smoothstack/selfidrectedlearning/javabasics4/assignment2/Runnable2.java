package org.smoothstack.selfidrectedlearning.javabasics4.assignment2;

import java.util.concurrent.locks.Lock;

public class Runnable2 implements Runnable {
    private Lock lock1 = null;
    private Lock lock2 = null;

    public Runnable2(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        System.out.println(threadName + " locking Lock2");
        this.lock2.lock();
        System.out.println(threadName + " locked Lock2");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException execption) {
            // { ... }
        }

        System.out.println(threadName + " locking Lock1");
        this.lock1.lock();
        System.out.println(threadName + " locked Lock1");

        // { ... }

        System.out.println(threadName + " unlocking Lock2");
        this.lock2.unlock();
        System.out.println(threadName + " unlocking Lock1");
        this.lock1.unlock();
    }
}
