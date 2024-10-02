package prob2A;

import java.util.*;

public class GradeReport {
    //instance of the other class
     private Student student;
     //list to store different grades to be included in the grade report
     private List<Grade> gradesList = new ArrayList<>();

     //package level access of grade report
    GradeReport(Student pupil){
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
