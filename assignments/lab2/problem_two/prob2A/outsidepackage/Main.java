package prob2A.outsidepackage;

import prob2A.Student;
import prob2A.GradeReport;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Sandra","A+");

        student.getGradeReport().getGrade();


        System.out.println("Student grade is:  " +student.getGradeReport().getGrade());
        System.out.println("Grades belong to : " +student.getName());

    }
}
