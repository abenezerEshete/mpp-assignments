
import java.util.*;

public class GradeReport {
     private Student student;
     //list to store different grades to be included in the grade report
     private List<Grade> gradesList = new ArrayList<>();

     //package level access of grade report
    GradeReport(Student pupil){
        //exactly one instance
        student=pupil;
    }

    public List<Grade> getGradesList() {
        return Collections.unmodifiableList(gradesList);
    }


    public Student getStudent() {
        return student;
    }
    //add grades to the grades list
    public void addGrades(Grade grade){
        gradesList.add(grade);
    }


}
