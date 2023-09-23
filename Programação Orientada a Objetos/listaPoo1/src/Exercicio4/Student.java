package Exercicio4;

public class Student {
    String name;
    private int correctAnswers;
    private double score;

    public Student(String name) {
        this.name = name;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(int correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double greatest(Student s){ // This method will return the score of the student with the greatest number of
                                        // correct answers. If this number is equal, will return the biggest score.
        if(this.correctAnswers > s.getCorrectAnswers()){
            return this.score;
        } else if (s.getCorrectAnswers() > this.correctAnswers){
            return s.getScore();
        } else if(this.correctAnswers == s.correctAnswers){
            if(this.score >= s.getScore()){
                return this.score;
            } else if(s.getScore() > this.score){
                return s.getScore();
            }
        }
        return -1; // error
    }

    @Override
    public String toString() {
        return "The student " +
                name + " got " +
                correctAnswers + " correct answers and a final score of " +
                score;
    }
}
