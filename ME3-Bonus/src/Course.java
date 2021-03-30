public class Course {
    private String title;
    private int units;
    private String section;

    public String getTitle(){ return title; }
    public void setTitle(String title){ this.title = title; }

    public int getUnits(){ return units; }
    public void setUnits(int unit){ this.units = unit; }

    public String getSection(){ return section; }
    public void setSection(String section){ this.section = section; }

    public Course(String title, int units, String section){
        this.title = title;
        this.units = units;
        this.section = section;
    }

    public String toString(){
        return title + ", Units: " + units + ", Section: "
                + section;
    }
}
