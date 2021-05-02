package com.company;

public class WorkWithAnimals {

    public static void main(String[] args){

        Dog fido = new Dog();

        fido.setName("Fido");
        System.out.println(fido.getName());


        fido.digHole();

        fido.setWeight(-1);

        int randNum = 10;

        fido.changeVar(10);
        System.out.println("randNum after method call is " +randNum);

        changeObjectName(fido);

        System.out.println("Dog name after method call is " +fido.getName());

        Animal doggy = new Dog();
        Animal kitty = new Cat();

        System.out.println("Animal sound by dog is " +doggy.getSound());
        System.out.println("Animal sound by cat is " +kitty.getSound());


        Animal[] animals = new Animal[4];
        animals[0] = doggy;
        animals[1] = kitty;

        System.out.println("Animal sound by dog is " +animals[0].getSound());
        System.out.println("Animal sound by dog is " +animals[1].getSound());


        speakAnimal(doggy);
        speakAnimal(kitty);

        ((Dog)doggy).digHole();

        fido.accessPrivate();

        Giraffe frank = new Giraffe();
        frank.setName("Frank");
        System.out.println(frank.getName());

        Monkey kong = new Monkey();
        kong.setName("Kong");
        System.out.println(kong.getName());
    }

        public static void changeObjectName(Dog fido){

        fido.setName("Melo");
        }

        public static void speakAnimal(Animal randAnimal){

            System.out.println("Animal sound by dog is " +randAnimal.getSound());
        }

}
