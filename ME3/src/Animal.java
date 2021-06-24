public class Animal {

    private String name;
    private int weight;
    private String sound;

    public void setName(String newName){ name = newName; }
    public String getName(){ return name; }

    public void setWeight(int newWeight){
        if (newWeight > 0){
            weight = newWeight;
        } else {
            System.out.println("Weight must be bigger than 0");
        }
    }
    public double getWeight(){ return weight; }

    public void setSound(String newSound){ sound = newSound; }
    public String getSound(){ return sound; }

    private void bePrivate(){
        System.out.println("I'm a private method");
    }

    public static void main(String[] args){

        Animal dog = new Animal();

        dog.setName("Grover");

        System.out.println(dog.getName());

    }

}