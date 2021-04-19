import java.util.ArrayList;

public class Org {

    private String name = "org name";
    private ArrayList <Student> members = new ArrayList<>();

    public void setName(String orgName) {
        name = orgName;
    }

    public String getName() {
        return name;
    }

    public void printMems(){

        if (members.isEmpty()) {
                System.out.println("none");
        }else {
            for(Student s: members)
                System.out.println(s.getName() + " ");
        }

    }
    public void acceptApp(Student student){

        members.add(student);
        student.setOrgMem(true);

    }

    public void kickMem(Student student){

        members.remove(student);
        student.setOrgMem(false);
    }
}
