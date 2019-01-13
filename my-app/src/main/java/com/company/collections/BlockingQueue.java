package com.company.collections;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue {

    private List queue;
    private int  limit;

    public BlockingQueue(int limit, List queue){
        this.limit = limit;
        this.queue = queue;
    }


    public void enqueue(Object item)
            throws InterruptedException  {
        synchronized (queue) {
            while (this.queue.size() == this.limit) {
                queue.wait(); // this will wait on sharedQueue
                // wait(); this will wait on the current instance of BlockingQueue
            }
            if (this.queue.size() == 0) {

                queue.notifyAll();
            }
            this.queue.add(item);
            System.out.println("Object added");
        }
    }


    public  Object dequeue()
            throws InterruptedException{
        synchronized (queue) {
            while (this.queue.size() == 0) {
                queue.wait();
            }
            if (this.queue.size() == this.limit) {
                queue.notifyAll();
            }

            System.out.println("Object removed");
            return this.queue.remove(0);
        }

    }


    public static void main(String[] args) {

        List<Object > sharedQueue = new LinkedList<>();
        Integer limit  = new Integer(10);
        BlockingQueue queue1 = new BlockingQueue(limit, sharedQueue);

        Thread t1 = new Thread(() ->  {

                try {
                    for(int i=0; i<100; i++) {
                        queue1.enqueue(new Object());

                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        });

        t1.start();



        BlockingQueue queue2 = new BlockingQueue(limit, sharedQueue);
        Thread t2 = new Thread(() -> {
                try {

                        for (int i = 0; i < 100; i++) {

                                Thread.sleep(1000);
                                queue2.dequeue();

                        }

                    } catch(InterruptedException e){
                        e.printStackTrace();

                }

        });

        t2.start();




    }

}
