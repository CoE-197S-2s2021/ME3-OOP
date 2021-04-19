import java.util.*;

public class Student {

    private String name = "student";
    private int student_num = 0;
    private ArrayList<String> subjects_taking = new ArrayList<>();
    private Map<String, String> grades = new HashMap<>();
    private Set <String> knowledge = new HashSet<>();
    private boolean orgMem = false;
    private boolean isAStudent = true;

    public void setOrgMem(boolean org) {
        orgMem = org;
    }

    public boolean isStudent() {
        return isAStudent;
    }

    public boolean isOrgMem(){return orgMem;}

    public void learn(String subject){
        knowledge.add(subject);
    }

    public void setGrade(String subject, String grade){
        if(subjects_taking.contains(subject))
            grades.merge(subject, grade, (oldValue, newValue) -> newValue);
    }

    public boolean hasLearned(String subject){ return knowledge.contains(subject); }
    public void setName(String studentName) { name = studentName; }
    public void setSN(int SN) { student_num = SN; }

    public void setSubjectsTaking(ArrayList<String> subjects) {
        subjects_taking = subjects;
        for(String s: subjects_taking)
            setGrade(s, "none");
    }

    public String getName() { return name; }
    public Set<String> getKnowledge() { return knowledge; }
    public int getSN() { return student_num; }

    public void printSubjectsTaking() {

        if(subjects_taking.isEmpty())
            System.out.println("none");
        else
            for (String s : subjects_taking) System.out.println(s);
    }

    public void printKnowledge() {
        if(knowledge.isEmpty())
            System.out.println("none");
        else
            for (String k : knowledge) System.out.println(k + " ");
    }
    public void printGrades(){
        if(grades.isEmpty())
            System.out.println("no subjects taking");
        else
        for(Map.Entry<String, String> m: grades.entrySet())
            System.out.println(m.getKey() + " = " + m.getValue());
    }
    public ArrayList<String> getSubjectsTaking() { return subjects_taking;}
    public Map<String, String> getGrades() { return grades; }

}
