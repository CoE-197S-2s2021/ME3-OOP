package com.coe197s;

public class WorkWithAnimals {



    public static void main(String[] args){
        Dog trisha = new Dog();
        trisha.setName("Trisha");
        System.out.println(trisha.getName());

        trisha.digHole();
        trisha.setWeight(-1);
        int randNum = 10;

        trisha.changeVar(randNum);
        System.out.println("randNum after method call: " + randNum);
        changeObjectName(trisha);
        System.out.println("Dog name after method call " + trisha.getName());

        Animal doggy = new Dog();
        Animal kitty = new Cat();

        System.out.println("Doggy says: " + doggy.getSound());
        System.out.println("Kitty says: " + kitty.getSound());

        Animal[] animals = new Animal[4];
        animals[0] = doggy;
        animals[1] = kitty;
        System.out.println("Doggy says: " + animals[0].getSound());
        System.out.println("Kitty says: " + animals[1].getSound());

        speakAnimal(doggy);
        speakAnimal(kitty);

        ((Dog)doggy).digHole();

        trisha.accessPrivate();

        Giraffe giraffe = new Giraffe();
        giraffe.setName("Frank");
        System.out.println(giraffe.getName());


    }
    public static void changeObjectName(Dog trisha){
        trisha.setName("Athena");
    }

    public static  void speakAnimal(Animal randAnimal){
        System.out.println("Animal says: " + randAnimal.getSound());
    }
}
