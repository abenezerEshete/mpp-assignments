package BiDirecional.BidirectionalOnetoOne.prob2A;

public class Student {

    private String name;
    private GradeReport gradeReport;


    public Student(String name, String grade){
        this.name = name;
        this.gradeReport = new GradeReport(grade,this);
    }

    public GradeReport getGradeReport(){
        return gradeReport;
    }

    public String getName(){
        return name;
    }
}
