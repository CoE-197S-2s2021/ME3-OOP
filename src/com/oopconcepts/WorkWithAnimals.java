package com.oopconcepts;

public class WorkWithAnimals
{
    int justANum = 10;

    public static void main(String[] args)
    {
        Dog fido = new Dog();
        fido.setName("Fido");
        System.out.println(fido.getName());

        fido.digHole();
        fido.setWeight(-1);

        int randNum = 10;
        fido.changeVar(randNum);
        System.out.println("randNum after method call: " + randNum);

        changeObjectName(fido);
        System.out.println("Dog name after method call " + fido.getName() );

        Animal doggy = new Dog();
        Animal kitty = new Cat();
        System.out.println("Doggy says: "+ doggy.getSound());
        System.out.println("Kitty says: "+ kitty.getSound() );

        Animal [] animals = new Animal[4];
        animals[0] = doggy;
        animals[1] = kitty;

        System.out.println("Doggy says: "+ animals[0].getSound());
        System.out.println("Kitty says: "+ animals[1].getSound());

        speakAnimal(doggy);

        ((Dog)doggy).digHole();

        //System.out.println(justANum);

        //sayHello();

        //fido.bePrivate();
        fido.accessPrivate();

        Giraffe giraffe = new Giraffe();
        giraffe.setName("Frank");
        System.out.println(giraffe.getName());
    }
    public static void changeObjectName(Dog fido)
    {
        fido.setName("Marcus");
    }

    public static void speakAnimal(Animal randAnimal)
    {
        System.out.println("Animal says: " + randAnimal.getSound());
    }

    public void sayHello()
    {
        System.out.println("Hello");
    }
}
