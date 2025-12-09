package org.lessons.java;

public class Ciclabile {
    private int[] innerList;
    private int currentIndex;

    //Constructors
    public Ciclabile(int[] newArray) {
        this.innerList = newArray;
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
        return currentIndex <= innerList.length;
    }

    public int getNextElement() {
        if (this.hasNextElement()) {
            int currentValue = innerList[currentIndex+1];
            currentIndex += 1;
            return currentValue;
        }
        System.out.println("We finished the array! Starting again from first element...");
        return innerList[0];

    }

}