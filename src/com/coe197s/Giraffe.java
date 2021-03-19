package com.coe197s;

public class Giraffe extends Creature{

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

    @Override
    public void setSound(String newSound) {

    }

    @Override
    public String getSound() {
        return null;
    }
}
