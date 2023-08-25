package org.example;

import javax.swing.JOptionPane;

public class Quiz {
    public static void main(String[] args) {
        Question question1 = new MultipleChoiceQuestion(
                "What country borders India?", "Nigeria", "Pakistan", "Rwanda", "Ghana", "France", "B");
        question1.check();

        Question question2 = new MultipleChoiceQuestion(
                "What is the capital of Australia?", "Sydney", "Melbourne", "Canberra", "Perth", "Brisbane", "C");
        question2.check();

        Question question3 = new MultipleChoiceQuestion(
                "Which planet is known as the Red Planet?", "Venus", "Mars", "Jupiter", "Saturn", "Mercury", "B");
        question3.check();

        Question question4 = new MultipleChoiceQuestion(
                "What is the largest ocean?", "Atlantic", "Indian", "Arctic", "Pacific", "Southern", "D");
        question4.check();

        Question question5 = new MultipleChoiceQuestion(
                "What is the chemical symbol for gold?", "Au", "Ag", "Hg", "Cu", "Pb", "A");
        question5.check();

        Question question6 = new TrueFalseQuestion("Water boils at 100 degrees Celsius.", "TRUE");
        question6.check();

        Question question7 = new TrueFalseQuestion("Mount Everest is the tallest mountain in the world.", "TRUE");
        question7.check();

        Question question8 = new TrueFalseQuestion("The sun is a planet.", "FALSE");
        question8.check();

        Question question9 = new TrueFalseQuestion("The Nile River is the longest river in the world.", "TRUE");
        question9.check();

        Question question10 = new TrueFalseQuestion("The moon is made of cheese.", "FALSE");
        question10.check();

        Question.showResults();
    }
}

