import java.util.ArrayList;

public class Student {
    private long id ;
    private String name;
    private final ArrayList<Integer> grades;

    public Student(long id, String name){
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's id
    public long getId(){
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double avg = 0;
        if(!grades.isEmpty()){
            int sum = 0;
            for(int grade: grades){
                sum += grade;
            }
            avg = (double)sum / grades.size();
        }

        return avg;
    }

}
