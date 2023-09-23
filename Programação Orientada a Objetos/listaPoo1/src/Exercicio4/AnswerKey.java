package Exercicio4;

public class AnswerKey {
    private char[] answers = new char [15]; // this vector corresponds of the correct answers of a test

    public AnswerKey(char[] answers) {
        this.answers = answers;
    }
    public char answerQuestion( int numberQuestion){
        return answers[numberQuestion];
    }
    public char[] getAnswers() {
        return answers;
    }
}
