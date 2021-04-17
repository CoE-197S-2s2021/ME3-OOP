package com.company;

public class Courses extends UniversityAffiliate{

    public String courseName;
    public String courseID;
    public String courseDescription;

    public void setCourseName(String newCourseName){ courseName=newCourseName; }
    public void setCourseID(String newCourseID){ courseID=newCourseID; }
    public void setCourseDescription(String newCourseDesc){ courseDescription = newCourseDesc; }

    public String getCourseName(){ return courseName; }
    public String getCourseID(){ return courseID; }
    public String getCourseDescription(){ return courseDescription; }
}
