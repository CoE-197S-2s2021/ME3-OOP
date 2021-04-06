package com.enriquezcodes;
import java.util.*;

public class Courses {
    private String coursename;
    private int courseduration;

    public void setCoursename(String newCoursename){ coursename = newCoursename;}
    public String getCoursename(){ return coursename;}

    public int getCourseduration(){ return courseduration;}
    public void setCourseduration(int newCourseduration){

        if(newCourseduration >= 2){
            courseduration = newCourseduration;
        }
        else {
            System.out.println("Course Duration must be at least 2 years");
        }
    }
}
