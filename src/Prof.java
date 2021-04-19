import java.util.ArrayList;

abstract public class Prof{

    protected String name = "prof";
    protected ArrayList<String> subjects_taught = new ArrayList<>();

    protected void teach(Student student){

        for (String s : subjects_taught)
            if (student.getSubjectsTaking().contains(s))
                student.learn(s);

    }

    protected void giveGrade(Student student){

        for (String s : subjects_taught)
            if (student.hasLearned(s))
                student.setGrade(s, "pass");
            else
                student.setGrade(s, "fail");

    }

    public void setName(String profName){ name = profName; }
    public String getName(){ return name; }
    public ArrayList<String> getSubjects_taught(){ return subjects_taught; }

    public void printSubjects_taught(){
        if(subjects_taught.isEmpty())
            System.out.println("none");
        else
            for(String s: subjects_taught)
                System.out.println(s + " ");
    }

}