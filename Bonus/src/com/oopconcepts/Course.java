package com.oopconcepts;

import java.util.ArrayList;

public class Course
{
    public String CourseTitle;
    public String Prerequisite = "None";
    public String DepartmentOffering;
    public ArrayList<Faculty> FacultyTeaching = new ArrayList<Faculty>();
    public ArrayList<Student> StudentsEnrolled = new ArrayList<Student>();
    public int Capacity = 10;

    public void getStudents()
    {
        System.out.println("The students of this course is/are:");
        for (Student student : StudentsEnrolled) System.out.println(student.Name);
    }

    public void getFaculty()
    {
        System.out.println("The handlers of this course is/are:");
        for (Faculty faculty : FacultyTeaching) System.out.println(faculty.Name);
    }
}
