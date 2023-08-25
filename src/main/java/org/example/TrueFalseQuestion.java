package org.example;

import javax.swing.*;

public class TrueFalseQuestion extends Question {
    public TrueFalseQuestion(String question, String answer) {
        super(question);
        this.question = "TRUE or FALSE: " + question;
        this.correctAnswer = convertAnswer(answer);
    }

    public String ask() {
        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            if (isValidAnswer(answer)) {
                return convertAnswer(answer);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter TRUE or FALSE.");
            }
        }
    }

    private boolean isValidAnswer(String answer) {
        String[] validAnswers = {"TRUE", "FALSE", "T", "F", "YES", "NO", "Y", "N"};
        return containsIgnoreCase(validAnswers, answer);
    }

    private String convertAnswer(String answer) {
        answer = answer.toUpperCase();
        if (answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES")) {
            return "TRUE";
        } else {
            return "FALSE";
        }
    }

    private boolean containsIgnoreCase(String[] array, String value) {
        for (String element : array) {
            if (element.equalsIgnoreCase(value)) {
                return true;
            }
        }
        return false;
    }
}
