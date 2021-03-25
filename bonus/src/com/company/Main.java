package com.company;

public class Main {

    public static void main(String[] args) {
        UniversityAffiliate jethro = new Professor();

        jethro.setUniversityName("University of The Philippines");
        jethro.setUniversityCampus("Diliman");
        System.out.println(jethro.getUniversityCampus());
        System.out.println(jethro.getUniversityName());

        ((Professor)jethro).setFacultyName("Jethro");
        ((Professor)jethro).setFacultyID("123");
        ((Professor)jethro).setDepartment("EEE");
        ((Professor)jethro).setUndergradDegree("BS CoE");
        ((Professor)jethro).setMastersDegree("Grandmaster");
        ((Professor)jethro).setPhd("The Best");

        ((Professor)jethro).getDetails();


        ((Professor)jethro).addCoursesTeaching("EEE 111");
        ((Professor)jethro).addCoursesTeaching("EEE 121");
        ((Professor)jethro).addCoursesTeaching("CoE 1000");
        System.out.println(((Professor)jethro).getCoursesTeaching());

        System.out.println("---------------------------------");

        UniversityAffiliate Joe = new Admin();

        ((Admin)Joe).setFacultyName("Joe");
        ((Admin)Joe).setFacultyID("101010");
        ((Admin)Joe).setDepartment("EEE");
        ((Admin)Joe).setUndergradDegree("BS ECE");
        ((Admin)Joe).setMastersDegree("SUPER MASTER");
        ((Admin)Joe).setPhd("NONE");

        ((Admin)Joe).getDetails();


        ((Admin)Joe).setAdminJob("Manager");
        System.out.println(((Admin)Joe).getAdminJob());

        System.out.println("---------------------------------");
        UniversityAffiliate Chad = new Student();
        ((Student)Chad).setStudentName("Chad");
        ((Student)Chad).setStudentID("8989");
        ((Student)Chad).setDepartment("EEE");
        ((Student)Chad).addCoursesTaking("CoE 197");
        ((Student)Chad).setUndergradProgram("BS ECE");
        ((Student)Chad).getDetails();

    }
}
