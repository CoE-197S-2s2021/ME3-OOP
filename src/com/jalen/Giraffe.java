package com.jalen;

public class Giraffe extends Creatures {

    private String name;

    @Override
    public void setName(String newName) {
        name = newName;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setWeight(double newWeight) {

    }

    @Override
    public double getWeight() {
        return 0;
    }
}