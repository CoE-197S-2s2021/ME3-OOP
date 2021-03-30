public class Department {

    private String name;

    public void setName(String newName){ name = newName; }
    public String getName(){ return name; }

    public Department(String dept){
        this.name = dept;
    }
}
