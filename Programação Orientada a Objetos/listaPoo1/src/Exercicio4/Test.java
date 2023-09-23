package Exercicio4;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;

        char [] ExamAnswers = {'B', 'D', 'A', 'C', 'E', 'D', 'B', 'C', 'A', 'E', 'A', 'D', 'B', 'C', 'E'}; // The corret answers to the exam


        AnswerKey a = new AnswerKey(ExamAnswers); // setting the answer key to the test with the correct answer vector
        Exam mathTest = new Exam(a); // setting the exam with the corresponding answer key

        Student s1 = new Student("Mary"); // setting two students
        char [] maryAnswers = {'B','D','C','C','E','B','A','C','A','D', 'A','D','B', 'C','A' }; //
        Student s2 = new Student("John");
        char[] johnAnswers = {'B', 'D', 'A', 'C', 'E', 'C', 'D', 'E', 'B', 'A', 'C', 'D', 'E', 'B', 'E'};


       /* for ( i = 0; i<15; i++){
            char ans = scan.next().charAt(0);
            exam1.studentAnswer(ans);
        }*/

        mathTest.setQuestions(maryAnswers);
         s1.setCorrectAnswers(mathTest.correctAnswers()); // setting mary amount of correct answers based on math test answer key
         s1.setScore( mathTest.finalScore()); // setting mary final score based on math test answer key

        mathTest.setQuestions(johnAnswers);
        s2.setCorrectAnswers(mathTest.correctAnswers()); // setting john amount of correct answers based on math test answer key
        s2.setScore( mathTest.finalScore()); // setting john final score based on math test answer key

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println("The score of the student with most correct answers is: " + s1.greatest(s2));



    }

}





