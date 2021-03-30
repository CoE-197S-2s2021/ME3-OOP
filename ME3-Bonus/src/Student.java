import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Student extends Member{

    private String studentNumber;
    private int yearLevel;
    private String program;
    private Map<String, Course> classes = new HashMap<>();
    public Department dept;
    public College college;

    public void setStudentNumber(String newStudentNumber){ studentNumber = newStudentNumber; }
    public String getStudentNumber(){ return studentNumber; }

    public void setYearLevel(int newYearLevel){ yearLevel = newYearLevel; }
    public int getYearLevel(){ return yearLevel; }

    public void setProgram(String newProgram){ program = newProgram; }
    public String getProgram(){ return program; }

    public Map<String, Course> getClasses(){ return classes; }

    public Student(String dept, String college){
        this.dept = new Department(dept);
        this.college = new College(college);
    }

    public void addAClass(String title, int units, String section){
        Course courseDetails = new Course(title, units, section);
        classes.put(title, courseDetails);
    }
    public void dropAClass(String title){
        classes.remove(title);
        System.out.println(this.getName() + " dropped " + title);
        System.out.println("Current classes: " + classes.keySet());
    }

}
