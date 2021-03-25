package com.company;

public class Admin extends Faculty{
    private String adminJob;

    public void setAdminJob(String newAdminJob){
        adminJob = newAdminJob;
    }

    public String getAdminJob(){
        return adminJob;
    }
}
