public class Animal {

    private String name;
    private double height;
    private int weight;
    private String sound;

    //Setter method for type string name
    public void setName(String newName) {
        name = newName;
    }
    //Getter method for type string name
    public String getName() {
        return name;
    }
    //Setter method for type int weight
    public void setWeight(int newWeight) {
        if (newWeight > 0) {
            weight = newWeight;
        } else {
            System.out.println("Weight must be bigger than 0");
        }
    }
    //Getter method for type int of weight
    public int getWeight() {
        return weight;
    }
    //Setter method for type string sound
    public void setSound(String newSound) {
        sound = newSound;
    }
    //Getter method for type string sound
    public String getSound() {
        return sound;
    }

}
