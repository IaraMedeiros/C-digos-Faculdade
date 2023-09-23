package Exercicio4;

public class Exam {
    private static int ANSWERCOUNT = 0;
    private char[] questions = new char[15]; // empty vector to be completed with student answers
    private double [] questionsWeight = {0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,1,1,1,1,1}; // the weight of each one of the 15 questions

    private AnswerKey answerKey;


    public void setQuestions(char[] questions) {
        this.questions = questions;
    }

    public Exam(AnswerKey answerKey) { // setting the correct answers to the exam
        this.answerKey = answerKey;
    }

    public char[] getQuestions() {
        return questions;
    }

    public void studentAnswer(char studentAnswer){ // to get the students answers to the 15 questions
        questions[ANSWERCOUNT] = studentAnswer;
        ANSWERCOUNT++; // each time this method is used, the answer counts increases

        if(ANSWERCOUNT == 15){ // when all the questions are completed, the counter is cleaned
            ANSWERCOUNT= 0;
        }
    }


    public int correctAnswers(){ // getting the amount of correct answers of a certain student
        int score = 0;
      char [] answerkey = answerKey.getAnswers();

        for(int i = 0; i<15; i++){
            if(questions[i] == answerkey[i]){
                score++; // score of correct answers increases when question answered is equal to the answer key
            }
        }
        return score;
    }

    public double finalScore(){ //returns final score of student based on the weight of the questions
        double finalScore = 0;

        char [] answerkey = answerKey.getAnswers();
        for(int i = 0; i<15; i++){
            if(questions[i] == answerkey[i]){
              finalScore = finalScore + questionsWeight[i];
            }
        }
        return finalScore;
    }





}
