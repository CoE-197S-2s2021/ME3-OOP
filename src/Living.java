public interface Living {

    // Note: Raises warning: Modifier 'public' is redundant for interface methods
    // I still kept it since it was in the tutorial

    public void setName(String newName);
    public String getName();

    public void setHeight(double newHeight);
    public double getHeight();

    public void setWeight(double newWeight);
    public double getWeight();

    public void setFavFood(String newFavFood);
    public String getFavFood();

    public void setSpeed(double newSpeed);
    public double getSpeed();

    public void setSound(String newSound);
    public String getSound();

}
