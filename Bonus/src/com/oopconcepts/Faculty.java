package com.oopconcepts;

import java.util.ArrayList;

public class Faculty extends Person
{
    public String Education;
    public int SalaryLevel;
    public String Ranking;
    public ArrayList<Course> CoursesTeaching = new ArrayList<Course>();

    public void teachCourse(Course course)
    {
        CoursesTeaching.add(course);
        course.FacultyTeaching.add(this);
    }

    public void dropStudent(Student student, Course dropcourse)
    {
        dropcourse.StudentsEnrolled.remove(student);
    }
    public String getRanking()
    {
        if(SalaryLevel<25000)
            Ranking = "Lecturer";
        else if (SalaryLevel<50000)
            Ranking = "Assistant Professor";
        else
            Ranking = "Professor";
        System.out.println(Ranking);
        return Ranking;
    }
    public void promotion(int raise)
    {
        SalaryLevel += raise;
        getRanking();
    }

}
