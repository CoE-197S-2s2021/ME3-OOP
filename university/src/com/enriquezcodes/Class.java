package com.enriquezcodes;
import java.util.*;

public class Class extends Courses{
    private String classname;
    private int classunits;

    public void setClassunits(int newClassunits){ classunits = newClassunits;}
    public int getClassunits(){ return classunits;}

    public String getClassname(){ return classname;}
    public void setClassname(String newClassname){
        classname = newClassname;
    }
}
