package com.seansom;

public class WorkWithAnimals {

    // static means that the method is not tied to an object
    public static void main(String[] args) {
        Dog fido = new Dog();
        fido.setName("Fido");
        fido.digHole();
        fido.setWeight(-1);

        int randNum = 10;
        // primitives are passed by value
        fido.changeVar(randNum);
        System.out.println("randNum after method: " + randNum);

        // complex objects are passed by reference
        changeObjectName(fido);
        System.out.println("Dog name after method: " + fido.getName());

        // A superclass may be instantiated by a subclass object
        Animal doggy = new Dog();
        doggy.setName("Lily");
        Animal kitty = new Cat();
        kitty.setName("Chewy");

        Animal[] animals = new Animal[2];
        animals[0] = doggy;
        animals[1] = kitty;

        speakAnimal(animals[0]);
        speakAnimal(animals[1]);

        // since doggy instantiates Animal, subclass methods can only be called after typecasting
        ((Dog)doggy).digHole();

        fido.accessPrivate();

        Giraffe giraffe = new Giraffe();
        giraffe.setName("Frank");
        System.out.println(giraffe.getName());
    }

    // complex objects are passed by reference
    public static void changeObjectName(Dog tiny) {
        tiny.setName("Tiny");
    }

    public static void speakAnimal(Animal a) {
        System.out.println(a.getName() + " says \"" + a.getSound() + "\"!" );
    }
}
