
public class Grade {
    //data member
    int score;

    //constructor of the class
    public Grade( int score) {
        this.score = score;
    }
    //getter method
    public Integer getScore() {
        return score;
    }
    //print scores
    @Override
    public String toString() {
        return String.valueOf(score);
    }
}
