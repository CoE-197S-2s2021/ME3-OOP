package com.CastilloME3;

import org.w3c.dom.ls.LSOutput;

public class WorkWithAnimals {
    int justANum = 10;

    public static void main(String[] args){
        Dog fido = new Dog(); //initializes object fido
        fido.setName("Fido");

        System.out.println(fido.getName());

        fido.dighole();

        fido.setWeight(-1); //prints "Weight must be bigger than 0"

        //everything is passed by value inside of Java
        int randNum = 10;

        fido.changeVar(randNum);

        System.out.println("randNum after method call: " + randNum); //result to 10

        changeObjectName(fido);

        System.out.println("Dog name after method call: " + fido.getName() );

        Animal doggy = new Dog();
        Animal kitty = new Cat();

        System.out.println("Doggy says: " + doggy.getSound()); //bark
        System.out.println("Kitty says: " + kitty.getSound()); //meow

        Animal[] animals = new Animal[4];
        animals[0] = doggy;
        animals[1] = kitty;

        System.out.println("Doggy says: " + animals[0].getSound()); //bark
        System.out.println("Kitty says: " + animals[1].getSound()); //meow

        speakAnimal(doggy); //Animal says: bark

        //doggy.digHole(); error 'cause doggy is in animal class
        ((Dog)doggy).dighole(); //cast to Dog object

        //cannot use non static variable/methods inside static method
        //System.out.println(justANum); ---wrong
        //sayHello(); ---wrong

        //cant call private methods
        //fido.bePrivate();
        fido.accessPrivate(); //executes 'In a private method' from private method

        Giraffe giraffe = new Giraffe();
        giraffe.setName("Frank");
        System.out.println(giraffe.getName());
    }
    //objects are passed by reference
    public static void changeObjectName(Dog fido) {//static means not tied to an object
        fido.setName("Marcus");
    }

    public static void speakAnimal(Animal randAnimal){
        System.out.println("Animal says: " + randAnimal.getSound());
    }

    public void sayHello(){
        System.out.println("Hello");
    }
}
