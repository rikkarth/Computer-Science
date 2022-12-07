package org.academiadecodigo.notorbios.concurrency.bqueue;

public class Pizza {

    private Topping topping;

    /**
     * Constructor will generate a random pizza when instanced
     */
    public Pizza(){
        topping = Topping.values()[(int)(Math.random() * Topping.values().length)];
    }

    @Override
    public String toString() {
        return "A " + topping.name() + " pizza";
    }

    private enum Topping {
        PEPPERONI,
        PINEAPPLE,
        MUSHROOM,
        PEPPERS,
        EXTRA_CHEESE;
    }
}
