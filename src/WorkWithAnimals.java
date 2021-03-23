public class WorkWithAnimals {

    int justANum = 10;

    // Main
    public static void main(String[] args) {

        Dog fido = new Dog();

        fido.setName("Fido");
        System.out.println(fido.getName());

        fido.digHole();

        fido.setWeight(-1);

        // Passed by value
        int randNum = 10;
        fido.changeVar(randNum);

        System.out.println("randNum after method call: " + randNum);

        // Objects are passed by reference
        changeObjectName(fido);

        System.out.println("Dog name after method call: " + fido.getName());

        // Create a Dog and Cat object as animal
        Animal doggy = new Dog();
        Animal kitty = new Cat();

        System.out.println("Doggy says: " + doggy.getSound());
        System.out.println("Kitty says: " + kitty.getSound() + "\n");

        // Now you can make arrays of Animals and everything just works

        Animal[] animals = new Animal[4];
        animals[0] = doggy;
        animals[1] = kitty;

        System.out.println("Doggy says: " + animals[0].getSound());
        System.out.println("Kitty says: " + animals[1].getSound() + "\n");

        // Sends Animal objects for processing in a method
        speakAnimal(doggy);

        // Cast object to access methods
        ((Dog) doggy).digHole();


        // You can't call a private method
//        fido.bePrivate();

        // You can execute a private method by using another public method
        fido.accessPrivate();

        // Creating a Giraffe from an abstract class
        Giraffe giraffe = new Giraffe();

        giraffe.setName("Frank");

        System.out.println(giraffe.getName());
    }

    // Static - Any methods that are in a class and not tied to an object must be labeled static.
    public static void changeObjectName(Dog fido) {
        fido.setName("Marcus");
    }

    // Receives any Animal objects
    public static void speakAnimal(Animal randAnimal) {
        System.out.println("Animal says: " + randAnimal.getSound());
    }

    // Can't call a non-static method inside a static method
    public void sayHello() {
        System.out.println("Hello");
    }

}