// Can't create object with abstract
abstract public class Creature {

    // Protected fields are like private fields except subclasses can inherit them
    protected String name;
    protected double height;
    protected int weight;
    protected String favFood;
    protected double speed;
    protected String sound;

    // Every abstract method must be overridden
    public abstract void setName(String newName);
    public abstract String getName();

    public abstract void setHeight(double newHeight);
    public abstract double getHeight();

    public abstract void setWeight(double newWeight);
    public abstract double getWeight();

    public abstract void setFavFood(String newFood);
    public abstract String getFavFood();

    public abstract void setSpeed(double newSpeed);
    public abstract double getSpeed();

    public abstract void setSound(String newSound);
    public abstract String getSound();

}