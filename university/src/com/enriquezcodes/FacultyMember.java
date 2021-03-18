package com.enriquezcodes;

public class FacultyMember extends Individual{
    private int senioritylevel = 5;
    private int salary = 30_000;
    private String position;

    public void setSenioritylevel(int newSenioritylevel){ senioritylevel = newSenioritylevel;}
    public int getSenioritylevel(){ return senioritylevel;}

    public void setSalary(int newSalary){ salary = newSalary;}
    public int getSalary(){ return salary;}

    public void setPosition(String newPosition){ position = newPosition;}
    public String position(){ return position;}

    public void promote(){
        senioritylevel = ++senioritylevel;
        salary += 5_000;
    }

    public void demote(){
        senioritylevel = --senioritylevel;
        salary -= 5_000;
    }

    public FacultyMember(){
        super();
        setGreet("I am a Faculty Member. Hello, friend");
    }
}
