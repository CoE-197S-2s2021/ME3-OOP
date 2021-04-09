package com.oopconcepts;
import java.util.ArrayList;

public class Student extends Person
{
    public String Degree;
    public String YearLevel;
    public int GWA;
    public ArrayList<Course> CurrentCourses = new ArrayList<Course>();
    public ArrayList<Course> CoursesTaken = new ArrayList<Course>();

    public void enrollStudent(String degree,String yearlevel)
    {
        Degree = degree;
        YearLevel = yearlevel;
        //IncomeBracket = ib;
    }

    public void coursesTaking()
    {
        for (int i = 0;i<CurrentCourses.size();i++) System.out.println(CurrentCourses.get(i).CourseTitle);
    }

    public void enrollCourse(Course course)
    {
        if (course.Capacity>0)
        {
            if (course.Prerequisite.equals("None"))
            {
                CurrentCourses.add(course);
                course.StudentsEnrolled.add(this);
                course.Capacity -= 1;
                System.out.println(this.Name + " is enrolled.");
            }
            else
            {
                for (int i = 0; i < CoursesTaken.size(); i++) {
                    if (course.Prerequisite.equals(CoursesTaken.get(i))) {
                        CurrentCourses.add(course);
                        course.StudentsEnrolled.add(this);
                        course.Capacity -= 1;
                        System.out.println(this.Name + " is enrolled.");
                        break;
                    } else
                        System.out.println("You don't have the pre-requisite for this course.");

                }
            }
        }
        else
            System.out.println("Sorry, " + this.Name + ", this class is full.");
    }

    public void dropCourse(Course course)
    {
        CurrentCourses.remove(course);
        course.Capacity += 1;
    }
    public void setGWA(int GWA) {
        this.GWA = GWA;
    }
    public void studentProfile()
    {
        System.out.println("Name and ID#: " + Name + ", " + IDNumber);
        System.out.println("Sex at Birth: " + SexAtBirth);
        System.out.println("Birthday: " + Birthday);
        System.out.println("Address: " + Address);
        System.out.println("Degree: " + Degree);
    }
}
