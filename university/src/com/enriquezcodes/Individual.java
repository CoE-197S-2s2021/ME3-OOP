package com.enriquezcodes;
import java.util.*;

public class Individual {
    public String name = "Student";
    private int age;
    private int id;
    private String department;
    private String greeting;

    public void setName(String newName){ name = newName;}
    public String getName(){ return name;}

    public void setDepartment(String newDepartment){ department = newDepartment;}
    public String getDepartment(){ return department;}

    public int getAge(){ return age;}
    public void setAge(int newAge){

        if(newAge >= 18){
            age = newAge;
        }
        else {
            System.out.println("Person must be at least 18 years of age");
        }
    }

    public void setID(int newID){ id = newID;}
    public int getID(){ return id;}

    public void setGreet(String newGreeting){ greeting = newGreeting;}
    public String greet(){ return greeting; }
}
