package org.academiadecodigo.notorbios.concurrency.bqueue;

import java.util.LinkedList;

/**
 * Blocking Queue
 *
 * @param <T> the type of elements stored by this queue
 */
public class BQueue<T> {

    private LinkedList<T> pizzaTable = new LinkedList<T>();
    private int limit;

    /**
     * Constructs a new queue with a maximum size
     *
     * @param limit the queue size
     */
    public BQueue(int limit) {
        this.limit = limit;
    }

    /**
     * Inserts the specified element into the queue
     * Blocking operation if the queue is full
     *
     * @param pizza the pizza to add to the queue
     */
    public synchronized void offer(T pizza) {

        // While linked list is equal to the defined limit then the method will wait/stop until notified
        while (pizzaTable.size() == limit) {

            try {

                wait();
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }

        pizzaTable.offer(pizza); // Produce pizza when linked list is not empty

        System.out.println(pizza.toString() + " has been made.");

        System.out.println("The table has: " + (pizzaTable.size()) + " pizza(s)");

        notifyAll();
    }

    /**
     * Retrieves and removes data from the head of the queue
     * Blocking operation if the queue is empty
     *
     * @return the data from the head of the queue
     */
    public synchronized T poll() {

        // If empty notify
        if(pizzaTable.isEmpty()) {
            notifyAll();
        }

        // While the linked list is empty the method will wait/stop until notified
        while(pizzaTable.isEmpty()) {

            try {

                wait();
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }

            System.out.println(Thread.currentThread().getName() + " has consumed a " + pizzaTable.getFirst().toString());

            return pizzaTable.poll(); // will remove a pizza from the head of the linked list
    }

    /**
     * Gets the number of elements in the queue
     *
     * @return the number of elements
     */
    public int getSize() {
        return pizzaTable.size();
    }

    /**
     * Gets the maximum number of elements that can be present in the queue
     *
     * @return the maximum number of elements
     */
    public int getLimit() {

        return limit;
    }
}
