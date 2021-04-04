public class Animal {

    private String name;
    private double height;
    private int weight;
    private String sound;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setHeight(double newHeight) {
        if(newHeight > 0) {
            height = newHeight;
        }
        else {
            System.out.println("Height must be higher than 0");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(int newWeight) {
        if(newWeight > 0) {
            weight = newWeight;
        }
        else {
            System.out.println("Weight must be bigger than 0");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setSound(String newSound) {
        sound = newSound;
    }

    public String getSound() {
        return sound;
    }

}