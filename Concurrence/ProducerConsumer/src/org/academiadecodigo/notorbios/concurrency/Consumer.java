package org.academiadecodigo.notorbios.concurrency;

import org.academiadecodigo.notorbios.concurrency.bqueue.BQueue;
import org.academiadecodigo.notorbios.concurrency.bqueue.Pizza;

/**
 * Consumer of integers from a blocking queue
 */
public class Consumer implements Runnable {

    private final BQueue<Pizza> queue;
    private int elementNum;

    /**
     * @param queue the blocking queue to consume elements from
     * @param elementNum the number of elements to consume
     */
    public Consumer(BQueue queue, int elementNum) {

        this.queue = queue;

        this.elementNum = elementNum;
    }

    @Override
    public void run() {

        while(elementNum > 0){

            queue.poll();

            elementNum--;
        }

        System.out.println(Thread.currentThread().getName() + " has reached elementNum -> 0");
    }
}
