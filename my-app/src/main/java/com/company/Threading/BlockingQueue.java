package com.company.Threading;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue<T> {

    private List<T> sharedQueue;
    private int limit = 10;

    private BlockingQueue(List<T> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    public synchronized void addElement(T data) {

        if(sharedQueue.size() < 10) {
            sharedQueue.add(data);
            notifyAll();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
