package org.lessons.java;

public class Ciclabile {
    private int[] innerList;
    private int currentIndex;

    //Constructors
    public Ciclabile() {
        this.innerList = new int[0];
        this.currentIndex = -1;
    }

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

    //Add element method 
    public void addElement(int newEl) {
        int[] result = new int[innerList.length + 1];

        for (int i = 0; i<result.length; i++) {
            if (i == result.length - 1) {
                result[i] = newEl;
            } else {
                result[i] = innerList[i];
            }
        }

        this.setInnerList(result);
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