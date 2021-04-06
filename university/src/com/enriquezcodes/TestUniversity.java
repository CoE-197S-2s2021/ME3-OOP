package com.enriquezcodes;
import java.util.*;


public class TestUniversity {

    public static void main(String[] args) {
        System.out.println("Student branch testing:");
        Student Student1 = new Student();
        Student1.setName("Marc");
        System.out.println(Student1.getName());
        System.out.println(Student1.greet());
        Student1.enrol();
        Student1.drop();
        Student1.graduate();
        Student1.setAge(15);
        System.out.println("Student branch testing end \n");

        System.out.println("Faculty Member branch testing:");
        FacultyMember Fac1 = new FacultyMember();
        Fac1.setName("Jamain");
        System.out.println(Fac1.getName());
        System.out.println(Fac1.greet());
        System.out.println("Before Promotion: " + Fac1.getSalary());
        Fac1.promote();
        System.out.println("After Promotion: " + Fac1.getSalary());
        System.out.println("Faculty Member branch testing end \n");

        System.out.println("Teacher branch testing:");
        Teacher teacher = new Teacher();
        teacher.setSubject("English");
        teacher.teach();
        System.out.println("Teacher branch testing end \n");

        System.out.println("Janitor branch testing:");
        Janitor janitor = new Janitor();
        janitor.setArea("Bathroom");
        janitor.clean();
        System.out.println("Janitor branch testing end \n");

        System.out.println("Simple Association testing:");
        Section section = new Section();
        section.setSectionname("AB");
        Student Student2 = new Student();
        Student2.setName("Thomas");
        Student Student3 = new Student();
        Student3.setName("Thomas The Engine");
        List<Student> newList = new ArrayList<Student>();
        newList.add(Student2);
        newList.add(Student3);
        section.setStudents(newList);

    }

}
