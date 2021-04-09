package com.oopconcepts;

public class Person
{
    public String Name, Birthday, Address, IDNumber, SexAtBirth;

    public void setName(String newName){Name = newName;}
    public void setIDNumber(String newID){IDNumber = newID;}
    public void setSexAtBirth(String newSAB){SexAtBirth = newSAB;}
    public void setBirthday(String newBDay){Birthday = newBDay;}
    public void setAddress(String newAddress){Address = newAddress;}

    public void set(String name, String ID, String SAB, String BDay, String address)
    {
        setName(name);
        setIDNumber(ID);
        setSexAtBirth(SAB);
        setBirthday(BDay);
        setAddress(address);
    }

    public String introduce()
    {
       return "Hi! I'm " + Name + "I'm from " + Address + ".";
    }
}