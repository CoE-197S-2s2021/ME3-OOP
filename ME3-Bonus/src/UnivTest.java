import java.util.Map;

public class UnivTest {
    public static void main(String[] args){
        Student student1 = new Student("EEE", "Engineering");
        student1.setName("DavidLanoy");
        student1.setStudentNumber("201807103");
        student1.setYearLevel(3);
        student1.setProgram("BS CoE");

        student1.addAClass("CoE197s", 3, "S-WFW2");
        student1.addAClass("CoE161", 3, "WFU");

        System.out.println(student1.getName() + ", " +  student1.getStudentNumber()
                + ", a year " + student1.getYearLevel() + " " + student1.college.getName() +  " in " + student1.dept.getName()
                + " is taking: ");
        for (Map.Entry mapElement : student1.getClasses().entrySet()) {
            String key
                    = (String)mapElement.getKey();

            Course value
                    = (Course)mapElement.getValue();

            System.out.println(value);
        }

        student1.dropAClass("CoE161");

        Faculty teacher1 = new Faculty("EEE", "Engineering");
        teacher1.setName("Sir Daren");
        teacher1.setPosition("Senior Lecturer");
        teacher1.addAClass("CoE197s", 3, "S-WFW2");

        System.out.println(teacher1.getName() + ", a " + teacher1.getPosition() +  " in " +
                teacher1.dept.getName() + " is handling:");
        for (Map.Entry mapElement : teacher1.getClasses().entrySet()) {
            String key
                    = (String)mapElement.getKey();

            Course value
                    = (Course)mapElement.getValue();

            System.out.println(value);
        }

        Admin admin1 = new Admin();
        admin1.setName("Fidel Nemenzo");
        admin1.setPosition("Chancellor");
        System.out.println(admin1.getName() + " is our " + admin1.getPosition());

    }
}
