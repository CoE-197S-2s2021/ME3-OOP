package com.company;

public class Dog extends Animal{


    public void digHole(){
        System.out.println("A hole has been dug");
    }


    public Dog(){
        super();

        setSound("Bark");
    }

    public void changeVar(int randNum){

        randNum = 24;

        System.out.println("randNum in method call is " + randNum);
    }

    private void bePrivate(){

        System.out.println("Inside Private Method");
    }

    public void accessPrivate(){

        bePrivate();
    }
}
