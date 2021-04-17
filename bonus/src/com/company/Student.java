package com.company;

import java.util.ArrayList;

public class Student extends UniversityAffiliate{
    private String studentName;
    private String studentID;
    private String department;
    private String undergradProgram;
    private ArrayList<String> coursesTaking = new ArrayList<String>();

    public void setStudentName(String newName){ studentName = newName; }
    public void setStudentID(String newID){ studentID = newID; }
    public void setDepartment(String newDpt){ department = newDpt; }
    public void setUndergradProgram(String newUndergradProgram){ undergradProgram = newUndergradProgram; }

    public void addCoursesTaking(String newCourseTaking){
        coursesTaking.add(newCourseTaking);
    }

    public String getStudentName(){ return studentName; }
    public String getStudentIDID(){ return studentID; }
    public String getDepartment(){ return department; }
    public String getUndergradProgram(){ return undergradProgram; }

    public ArrayList<String> getCoursesTaking(){
        return coursesTaking;
    }

    public void getDetails() {
        System.out.println("Name: "+studentName);
        System.out.println("Studnent ID: "+studentID);
        System.out.println("Department: "+department);
        System.out.println("Undergraduate Program: "+undergradProgram);
        System.out.print("Courses Taking: "+coursesTaking);

    }

}
