package com.oopconcepts;

public class Dog extends Animal
{
    public void digHole(Cat cat)
    {
        System.out.println("Dug a hole");
        cat.test -= 1;
        System.out.println(cat.test);
    }

    public Dog()
    {
        super();
        setSound("Bark");
    }

    public void changeVar(int randNum)
    {
        randNum = 12;
        System.out.println("randNum in method: " + randNum);
    }

    private void bePrivate()
    {
        System.out.println("In a private method");
    }
    public void accessPrivate()
    {
        bePrivate();
    }
}
