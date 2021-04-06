package com.seansom;

// interfaces can only have abstract, default, and static methods
public interface Living {
    public void setName(String newName);
    public String getName();

    public void setHeight(double newHeight);
    public double getHeight();

    public void setWeight(double newWeight);
    public double getWeight();

    public void setFavFood(String newFood);
    public String getFavFood();

    public void setSpeed(double newSpeed);
    public double getSpeed();

    public void setSound(String newSound);
    public String getSound();
}
