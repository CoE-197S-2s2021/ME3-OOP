package com.seansom;

// abstract classes can also have non-abstract methods
// abstract methods must be implemented and overridden by subclasses
abstract public class Creature {
    protected String name;
    protected int weight;
    protected String sound;

    public abstract void setName(String newName);
    public abstract String getName();

    public abstract void setWeight(int newWeight);
    public abstract int getWeight();

}
