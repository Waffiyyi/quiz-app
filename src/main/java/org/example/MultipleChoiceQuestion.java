package org.example;

import javax.swing.JOptionPane;

public class MultipleChoiceQuestion extends Question {
    private QuestionDialog questionDialog;
    public MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
        super(query);
        questionDialog = new QuestionDialog();

        addChoice("A", a);
        addChoice("B", b);
        addChoice("C", c);
        addChoice("D", d);
        addChoice("E", e);

        correctAnswer = answer.toUpperCase();
    }

    public void addChoice(String name, String label) {
        questionDialog.addButton(name, label);
    }

    public String ask() {
        questionDialog.setVisible(true);
        return questionDialog.answer;
    }

}

