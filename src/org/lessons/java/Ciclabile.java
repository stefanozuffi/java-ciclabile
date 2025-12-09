package org.lessons.java;

public class Ciclabile {
    private int[] innerList;
    private int currentIndex;

    //Constructors
    public Ciclabile(int[] newArray) {
        this.innerList = newArray;
        this.currentIndex = -1;
    }

    //Getter/Setter
    public int[] getInnerList() {
        return this.innerList;
    }

    public void setInnerList(int[] newArray) {
        this.innerList = newArray;
    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    public void setCurrentIndex(int newIndex) {
        this.currentIndex = newIndex;
    }

    //Iterator Methods
    private boolean hasNextElement() {
        return currentIndex < innerList.length - 1;
    }

    public int getNextElement() {
        if (this.hasNextElement()) {
            int currentValue = innerList[currentIndex+1];
            currentIndex += 1;
            return currentValue;
        }
        System.out.println("We finished the array! Starting again from first element...");
        currentIndex = 0;
        return innerList[0];

    }

    //ToString
    @Override
    public String toString() {
        String res = "[";

        for (int i : this.innerList) {
            res += " " + i + " ";
        }

        res += "]";
        return res;
    }

}