package prob2A;

//Student "has" the 1-1 relationship with GradeReport: Student is the owner of this relationship
public class Student {
    private String name;
    private GradeReport grades;

    public Student(String name){
        this.name = name;
        //initialize the object of Gradereport to maintain the 1-1 relationship
        grades = new GradeReport(this);
    }

    public String getName(){
        return name;
    }

    public GradeReport getGrades(){
        return grades;
    }

    @Override
    public String toString(){
        return name;
    }

}
