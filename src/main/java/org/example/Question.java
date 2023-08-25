package org.example;

import javax.swing.*;

public abstract class Question {
    static int nQuestions = 0;
    static int nCorrect = 0;

    String question;
    String correctAnswer;
    String query;

    public Question(String query) {
        this.query = query;
    }


    public abstract String ask();

    void check() {
        nQuestions++;
        String answer = ask();

        if (answer.equals(correctAnswer)) {
            JOptionPane.showMessageDialog(null, "Correct!");
            nCorrect++;
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer);
        }
    }

    static void showResults() {
        JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions");
    }
}
