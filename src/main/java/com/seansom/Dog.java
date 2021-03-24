package com.seansom;

public class Dog extends Animal {

    // constructor
    public Dog() {
        super();
        setSound("Bark");
    }

    // overriding superclass methods or creating new methods for the subclass can be done
    public void digHole() {
        System.out.println("Dug a hole.");
    }

    // primitives are passed by value
    public void changeVar(int randNum) {
        randNum = 12;
        System.out.println("randNum in method: " + randNum);
    }


    // private methods cannot be accessed outside the class
    private void samplePrivate() {
        System.out.println("In a private method of Dog object.");
    }

    public void accessPrivate() {
        samplePrivate();
    }
}
