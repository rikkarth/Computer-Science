package org.academiadecodigo.notorbios.concurrency;

import org.academiadecodigo.notorbios.concurrency.bqueue.BQueue;
import org.academiadecodigo.notorbios.concurrency.bqueue.Pizza;

/**
 * Produces and stores integers into a blocking queue
 */
public class Producer implements Runnable {

    private final BQueue<Pizza> queue;
    private int elementNum;

    /**
     * @param queue the blocking queue to add elements to
     * @param elementNum the number of elements to produce
     */
    public Producer(BQueue queue, int elementNum) {

        this.queue = queue;

        this.elementNum = elementNum;
    }

    @Override
    public void run() {

        while (elementNum > 0) {

            queue.offer(new Pizza());

            elementNum--;
        }

        System.out.println("I have finished making all pizzas");
    }
}
