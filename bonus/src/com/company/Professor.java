package com.company;
import java.util.ArrayList;

public class Professor extends Faculty{

    private ArrayList<String> coursesTeaching = new ArrayList<String>();

    public void addCoursesTeaching(String newCourseTeaching){
        coursesTeaching.add(newCourseTeaching);
    }

    public ArrayList<String> getCoursesTeaching(){
        return coursesTeaching;
    }

}
