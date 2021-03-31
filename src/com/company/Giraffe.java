package com.company;

public class Giraffe extends Creature{

    private String name;

    @Override
    public void setName(String newName) {
        name = newName;

    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public void setWeight(double newWeight) {
        // TODO Auto-generated method stub

    }

    @Override
    public double getWeight() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setSound(String newSound) {

    }

    @Override
    public String getSound() {
        return sound;
    }

    @Override
    public void setSpeed(double newSpeed){

    }

    @Override
    public double getSpeed(){
        return speed;
    }

    @Override
    public void setFavFood(String newFavFood) {

    }

    @Override
    public String getFavFood() {
        return favFood;
    }

    @Override
    public void setHeight(double newHeight){

    }

    @Override
    public double getHeight(){
        return height;
    }
}