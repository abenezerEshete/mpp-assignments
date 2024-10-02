package prob2A.outsidepackage;

import prob2A.Student;
import prob2A.GradeReport;
import prob2A.Grade;

public class Main {
    public static void main(String[] args) {
        Student pupil = new Student("Hewitt");
        pupil.getGrades().addGrades(new Grade(100));
        pupil.getGrades().addGrades(new Grade(95));
        pupil.getGrades().addGrades(new Grade(98));
        System.out.println("Hewitt's scores are: " + pupil.getGrades().getGradesList());

        //to show that its bidirectional
        GradeReport grades = pupil.getGrades();
        System.out.println("The above grades belong to: " + grades.getStudent());
    }
}