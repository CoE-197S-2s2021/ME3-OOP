package com.enriquezcodes;
import java.util.*;

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

class Section extends Class{
    private String sectionname;
    List<Student> students;

    public String getSectionname() {
        return sectionname;
    }

    public void setSectionname(String sectionname) {
        this.sectionname = sectionname;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> student) {
        this.students = students;
    }

}
