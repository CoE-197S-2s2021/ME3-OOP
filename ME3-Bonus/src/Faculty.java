import java.util.HashMap;
import java.util.Map;

public class Faculty extends Member{

    private String position;
    private Map<String, Course> classes = new HashMap<>();
    public Department dept;
    public College college;

    public void setPosition(String newPosition){ position = newPosition; }
    public String getPosition(){ return position; }

    public Faculty(String dept, String college){
        this.dept = new Department(dept);
        this.college = new College(college);
    }

    public void addAClass(String title, int units, String section){
        Course courseDetails = new Course(title, units, section);
        classes.put(title, courseDetails);
    }

    public Map<String, Course> getClasses(){ return classes; }
}
