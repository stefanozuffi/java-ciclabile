package org.lessons.java;

public class Main {
    public void main(String[] args) {
        Ciclabile iteration = new Ciclabile(new int[] {1,2,3,4});

        System.out.println(iteration.toString());

        System.out.println(iteration.getNextElement());
        System.out.println(iteration.getNextElement());
        System.out.println(iteration.getNextElement());
        System.out.println(iteration.getNextElement());
        System.out.println(iteration.getNextElement());
    }
}
