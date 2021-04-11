public class Giraffe extends Creature{

    private String name;
    protected double height;
    protected double weight;
    protected String favFood;
    protected double speed;
    protected String sound;

    @Override
    public void setName(String newName) {
        name = newName;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setHeight(double newheight) {
        height = newheight;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void setWeight(double newWeight) {
        weight = newWeight;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setFavFood(String newFood) {
        favFood = newFood;
    }

    @Override
    public String getFavFood() {
        return favFood;
    }

    @Override
    public void setSpeed(double newSpeed) {
        speed = newSpeed;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void setSound(String newSound) {
        sound = newSound;
    }

    @Override
    public String getSound() {
        return sound;
    }
}