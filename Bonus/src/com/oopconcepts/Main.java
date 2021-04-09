package com.oopconcepts;

public class Main {

    public static void main(String[] args)
    {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();
        Student student7 = new Student();
        Student student8 = new Student();
        Student student9 = new Student();
        Student student10 = new Student();
        Student student11 = new Student();

        Faculty facu1 = new Faculty();
        Faculty facu2 = new Faculty();
        Faculty facu3 = new Faculty();

        NonTeaching nt1 = new NonTeaching();

        Course course1 = new Course();
        Course course2 = new Course();
        Course course3 = new Course();
        Course course4 = new Course();

        student1.set("Kurt Adonis","201802943","Male","June 26, 2000","Malolos, Bulacan");
        student1.enrollStudent("BS ECE","3rd Year");
        student1.introduce();
        student1.CoursesTaken.add(course3);

        student2.set("John Doe","201789754","Male","June 30, 2000","Bulakan, Bulacan");
        student2.enrollStudent("BS CoE","4th Year");
        student2.introduce();

        student3.set("Juan Dela Cruz","201801234","Male","April 14, 2001","Cavite");
        student3.enrollStudent("BS IE","3rd Year");

        student4.set("John Cruz","201801334","Male","April 14, 2001","Pampanga");
        student4.enrollStudent("BS CE","3rd Year");

        student5.set("Eman Cu","201801034","Male","April 14, 2001","Manila");
        student5.enrollStudent("BS EE","3rd Year");

        student6.set("Jeff Te","201834234","Male","April 14, 2001","Quezon City");
        student6.enrollStudent("BS IE","3rd Year");

        student7.set("Cutie Patootie","201421234","Female","September 14, 2001","Malolos, Bulacan");
        student7.enrollStudent("BA Pol Sci","5th Year");

        student8.set("Juan Dela Cruz","201807634","Male","April 14, 2001","Bocaue, Bulacan");
        student8.enrollStudent("BS IE","3rd Year");

        student9.set("Kris Chua","201807934","Female","January 14, 2001","Muntinlupa");
        student9.enrollStudent("BS CoE","3rd Year");

        student10.set("Ella Dizon","201607634","Female","October 9, 1999","Bocaue, Bulacan");
        student10.enrollStudent("BS IE","4th Year");

        student11.set("Joshua Lopez","201787634","Male","April 14, 2001","Bulacan");
        student11.enrollStudent("BS ME","3rd Year");

        facu1.set("Francis Sy","200102356","Male","April 4, 1995","Guiguinto, Bulacan");
        facu1.teachCourse(course1);
        facu1.introduce();
        facu1.SalaryLevel = 20_000;
        facu1.Education = "Masters";

        facu2.set("Jenny Faustino","199902356","Female","April 4, 1985","Laguna");
        facu2.teachCourse(course2);
        facu2.SalaryLevel = 55_000;
        facu2.Education = "PhD";

        facu3.set("Anne Franklin","200098763","Female","April 4, 1987","Ilocos");
        facu3.teachCourse(course2);
        facu3.SalaryLevel = 65_000;
        facu3.Education = "Masters";

        nt1.set("Jerry Maya","200687902","Male","April 4, 1989","Bicol");
        nt1.setPosition("Staff");
        nt1.introduce();
        nt1.setSalary(13_000);

        course1.CourseTitle = "Kas 1";
        course1.DepartmentOffering = "Department of History";
        course1.FacultyTeaching.add(facu1);

        course2.CourseTitle = "Math 20";
        course2.DepartmentOffering = "Department of Math";
        course2.FacultyTeaching.add(facu2);

        course3.CourseTitle = "Math 21";
        course3.Prerequisite = "Math 20";
        course3.DepartmentOffering = "Department of Math";
        course3.FacultyTeaching.add(facu3);

        course4.CourseTitle = "Arts 1";
        course4.DepartmentOffering = "Department of Arts and Literature";
        course4.FacultyTeaching.add(facu3);

        //Commands
        student1.studentProfile();
        student1.enrollCourse(course1);
        student2.enrollCourse(course1);
        student3.enrollCourse(course1);
        student4.enrollCourse(course1);
        student5.enrollCourse(course1);
        student6.enrollCourse(course1);
        student7.enrollCourse(course1);
        student8.enrollCourse(course1);
        student9.enrollCourse(course1);
        student10.enrollCourse(course1);
        student11.enrollCourse(course1);
        student1.enrollCourse(course4);
        student1.enrollCourse(course3);
        student2.enrollCourse(course3);
        student2.enrollCourse(course2);
        student3.enrollCourse(course2);
        student4.enrollCourse(course2);
        student5.enrollCourse(course2);

        course1.getStudents();
        course1.getFaculty();
        course2.getStudents();
        course2.getFaculty();
        course3.getStudents();
        course3.getFaculty();

        facu3.promotion(25_000);
        facu3.getRanking();

        facu2.dropStudent(student3,course2);
        course2.getStudents();
        student1.dropCourse(course1);
        student1.coursesTaking();
    }
}
