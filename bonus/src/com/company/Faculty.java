package com.company;

public class Faculty extends UniversityAffiliate{

    private String facultyName;
    private String facultyID;
    private String department;
    private String undergradDegree;
    private String mastersDegree;
    private String phd;

    public void setFacultyName(String newName){ facultyName = newName; }
    public void setFacultyID(String newID){ facultyID = newID; }
    public void setDepartment(String newDpt){ department = newDpt; }
    public void setUndergradDegree(String newUndergradDegree){ undergradDegree = newUndergradDegree; }
    public void setMastersDegree(String newMastersDegree){ mastersDegree = newMastersDegree; }
    public void setPhd(String newPhd){ phd = newPhd; }

    public String getFacultyName(){ return facultyName; }
    public String getFacultyID(){ return facultyID; }
    public String getDepartment(){ return department; }
    public String getUndergradDegree(){ return undergradDegree; }
    public String getMastersDegree(){ return mastersDegree; }
    public String getPhd(){ return phd; }

    public void getDetails() {
        System.out.println("Name: "+facultyName);
        System.out.println("Faculty ID: "+facultyID);
        System.out.println("Department: "+department);
        System.out.println("Undergraduate degree: "+undergradDegree);
        System.out.println("Masters degree: "+mastersDegree);
        System.out.println("PhD: "+phd);
    }
}
