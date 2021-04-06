package com.CastilloME3;

public class Dog extends Animal {

    public void dighole(){
        System.out.println("Dug a hole");
    }

    public Dog(){ //initialize object created
        super();

        setSound("Bark");
    }

    public void changeVar(int randNum){
        randNum = 12;
        System.out.println("randNum in method: " + randNum); //results to 10
    }

    private void bePrivate(){
        System.out.println("In a private method");
    }

    public void accessPrivate(){
        bePrivate();
    }
}
