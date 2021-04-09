package com.coe197s;

public class Animal {
    private String name;
    private int weight;
    private String sound;

    public void setName(String new_name) { name = new_name; }
    public String getName(){
        return name;
    }

    public void setWeight(int new_weight){
        if (new_weight > 0){
            weight = new_weight;
        }
        else{
            System.out.println("Weight must be greater than 0");
        }
    }
    public int getWeight(){ return weight; }

    public void setSound(String new_sound) { sound = new_sound; }
    public String getSound(){ return sound; }
}
