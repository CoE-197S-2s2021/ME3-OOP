package com.seansom;

public class Animal {
    private String name;
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
