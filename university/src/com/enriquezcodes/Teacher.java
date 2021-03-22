package com.enriquezcodes;
import java.util.*;

public class Teacher extends FacultyMember{
    private String subject;

    public void setSubject(String newSubject){ subject = newSubject;}
    public String subject(){ return subject;}

    public void teach(){
        System.out.println("I am teaching " + subject + ". Brrrrrrr.");
    }
}
