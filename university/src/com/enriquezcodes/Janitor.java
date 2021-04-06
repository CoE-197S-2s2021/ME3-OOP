package com.enriquezcodes;
import java.util.*;

public class Janitor extends FacultyMember{
    private String area;

    public void setArea(String newArea){ area = newArea;}
    public String area(){ return area;}

    public void clean(){
        System.out.println("I am cleaning " + area + ". Brrrrrrr.");
    }
}
