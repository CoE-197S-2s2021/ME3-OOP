package com.jalen;

import java.util.function.DoubleFunction;

public class WorkWithAnimals {

    public static void main(String[] args){
        Dog bachuchay = new Dog();

        bachuchay.setName("Bachuchay");
        System.out.println(bachuchay.getName());

        bachuchay.digHole();
        bachuchay.setWeight(-1);

        changeObjectName(bachuchay);
        System.out.println(bachuchay.getName());

        Animal doggy = new Dog();
        Animal kitty = new Cat();
        System.out.println("Doggy says: " + doggy.getSound());
        System.out.println("Kitty says: " + kitty.getSound());

        Animal[] animals = new Animal[4];
        animals[0] = doggy;
        animals[1] = kitty;

        speakAnimal(doggy);
        ((Dog)doggy).digHole();
        bachuchay.accessPrivate();

        Giraffe stanley = new Giraffe();

        stanley.setName("Stanley");
        System.out.println(stanley.getName());
    }
    public static void changeObjectName(Dog bachuchay){
        bachuchay.setName("Bachuchism");
    }
    public static void speakAnimal(Animal randAnimal){
        System.out.println("Animal says: " + randAnimal.getSound());
    }

}
