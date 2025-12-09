package org.lessons.java;

public class Main {
    public static void main(String[] args) {
        Ciclabile iteration = new Ciclabile(new int[] {1,2,3,4});

        System.out.println(iteration.toString());

        System.out.println(iteration.getNextElement());
        System.out.println(iteration.getNextElement());
        System.out.println(iteration.getNextElement());
        System.out.println(iteration.getNextElement());
        System.out.println(iteration.getNextElement());


        Ciclabile iter2 = new Ciclabile();

        iter2.addElement(10);
        iter2.addElement(20);
        iter2.addElement(30);
        iter2.addElement(40);
        iter2.addElement(50);

        System.out.println(iter2.getNextElement());
        System.out.println(iter2.getNextElement());
        System.out.println(iter2.getNextElement());
        System.out.println(iter2.getNextElement());
        System.out.println(iter2.getNextElement());
        System.out.println(iter2.getNextElement());
        System.out.println(iter2.getNextElement());
        System.out.println(iter2.getNextElement());

    }
}
