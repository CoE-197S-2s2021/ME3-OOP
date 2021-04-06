package com.CastilloME3;

abstract public class Creature {
    //cannot create objects from abstract class
    //it is a must that all methods here should be implemented in its subclass
    protected String name;
    protected int weight;
    protected String sound;

    public abstract void setName(String newName);
    public abstract String getName();

    public abstract void setWeight(double newWeight);
    public abstract double getWeight();
}
