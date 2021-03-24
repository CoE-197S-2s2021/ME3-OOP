package com.seansom;

public class Animal {

    // public = accessible anywhere
    // protected = only accessible within class, subclass, and package members
    // private = only accessible within class (methods)

    private String name = "Noname";
    private int weight;
    private String sound;

    public void setName(String newName) {
        name = newName;
    }

    public void setWeight(int newWeight) {
        if (newWeight > 0) {
            weight = newWeight;
        } else {
            System.out.println("Error: weight < 0");
        }
    }

    public void setSound(String newSound) {
        sound = newSound;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }
}
