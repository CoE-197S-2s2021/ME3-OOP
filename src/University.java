import java.util.ArrayList;
import java.util.Arrays;

public class University {

    public static void main(String[] args){

        //composition: prof and student cannot exist without university
        FullTime sirDarvy = new FullTime();
        PartTime sirDaren = new PartTime();
        Student ella = new Student();

        Org circuit = new Org();
        String[] subjectSetA = new String[] {"CoE 197S", "CoE 134", "CoE 133"};
        String[] subjectSetB = new String[] {"CoE 197S"};
        String[] subjectSetC = new String[] {"CoE 197S", "CoE 134", "CoE 133", "CoE198"};

        System.out.println("sir daren object name before set name:");
        System.out.println(sirDaren.getName());
        System.out.println("sir darvy object name before set name:");
        System.out.println(sirDarvy.getName());
        sirDaren.setName("Sir Daren");
        sirDarvy.setName("Sir Darvy");
        System.out.println("sir daren object name after set name");
        System.out.println(sirDaren.getName());
        System.out.println("sir darvy object name after set name");
        System.out.println(sirDarvy.getName());

        System.out.println("sir daren default subjects taught");
        sirDaren.printSubjects_taught();
        System.out.println("sir darvy default subjects taught");
        sirDarvy.printSubjects_taught();
        sirDarvy.setSubjectsTaught(sirDaren,new ArrayList<>(Arrays.asList(subjectSetA)));
        sirDarvy.setSubjectsTaught(sirDarvy,new ArrayList<>(Arrays.asList(subjectSetB)));
        System.out.println("sir daren set subjects taught");
        sirDaren.printSubjects_taught();
        System.out.println("sir darvy set subjects taught");
        sirDarvy.printSubjects_taught();

        System.out.println("sir daren default company");
        System.out.println(sirDaren.getCompany());
        sirDaren.setCompany("Arch Insurance Group Inc.");
        System.out.println("sir daren set company");
        System.out.println(sirDaren.getCompany());

        System.out.println("ella default name");
        System.out.println(ella.getName());
        ella.setName("Ella");
        System.out.println("ella set name");
        System.out.println(ella.getName());

        System.out.println("ella default SN");
        System.out.println(ella.getSN());
        ella.setSN(201503203);
        System.out.println("ella set SN");
        System.out.println(ella.getSN());

        System.out.println("ella default subjects taking");
        ella.printSubjectsTaking();
        ella.setSubjectsTaking(new ArrayList<>(Arrays.asList(subjectSetC)));
        System.out.println("ella new subjects taking");
        ella.printSubjectsTaking();

        System.out.println("ella knowledge before being taught");
        ella.printKnowledge();
        sirDarvy.teach(ella);
        System.out.println("ella knowledge after being taught by sir darvy");
        ella.printKnowledge();
        System.out.println("ella knowledge after being taught by sir daren");
        sirDaren.teach(ella);
        ella.printKnowledge();

        System.out.println("ella default grades");
        ella.printGrades();
        System.out.println("ella after being graded by sir darvy");
        sirDarvy.giveGrade(ella);
        ella.printGrades();
        System.out.println("ella after being graded by sir darvy");
        sirDaren.giveGrade(ella);
        ella.printGrades();

        //aggregation: student can still exist without org

        System.out.println("Is ella an org mem?" + ella.isOrgMem());
        System.out.println("Is ella still a student?" + ella.isStudent());

        System.out.println("org name before setting:" + circuit.getName());
        circuit.setName("Circuit");
        System.out.println("set org name:" + circuit.getName());
        System.out.println("Who are its members?");
        circuit.printMems();
        System.out.println("Accept ella as mem here");
        circuit.acceptApp(ella);
        System.out.println("Who are circuit's mems now?");
        circuit.printMems();
        System.out.println("Is ella an org mem now?" + ella.isOrgMem());
        System.out.println("Is ella still a student?" + ella.isStudent());
        System.out.println("Remove ella as a mem here");
        circuit.kickMem(ella);
        System.out.println("Is ella an org mem now?" + ella.isOrgMem());
        System.out.println("Who are circuit's mems now?");
        circuit.printMems();
        System.out.println("is ella still a student?");
        System.out.println(ella.isStudent());

    }

}
