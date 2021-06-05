abstract public class Creature {

    protected String name;
    protected int weight;
    private String sound;

    public abstract void setName(String newName);
    public abstract String getName();

    public abstract void setWeight(double newWeight);
    public abstract double getWeight();
}
