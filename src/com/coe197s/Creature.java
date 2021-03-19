package com.coe197s;

abstract public class Creature {

    protected String name;
    protected double weight;
    protected  String sound;

    public abstract void setName(String newName);
    public abstract String getName();

    public abstract void setWeight(double newWeight);
    public abstract double getWeight();

    public abstract void setSound(String newSound);
    public abstract String getSound();

}
