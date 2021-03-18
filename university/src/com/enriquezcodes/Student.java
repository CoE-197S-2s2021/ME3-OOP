package com.enriquezcodes;

public class Student extends Individual{

    private String yearlevel;
    private String organization;
    private float GWA;

    public void setYearlevel(String newYearlevel){ yearlevel = newYearlevel;}
    public String getYearlevel(){ return yearlevel;}

    public void setOrganization(String newOrganization){ organization = newOrganization;}
    public String getOrganization(){ return organization;}

    public void setName(float newGWA){ GWA = newGWA;}
    public float getGWA(){ return GWA;}

    public void enrol(){
        System.out.println(name + " enrolled");
    }
    public void drop(){
        System.out.println(name + " dropped");
    }
    public void graduate(){
        System.out.println(name + " graduated");
    }

    public Student(){
        super();
        setGreet("I am a student. Hello, friend");
    }
}
