package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuestionDialog extends JDialog implements ActionListener {
    String answer;

    public QuestionDialog() {
        this.setLayout(new GridLayout(0, 1));
        this.setModal(true);
        this.setLocationRelativeTo(null);
    }

    public void addButton(String name, String label) {
        JButton button = new JButton(name);
        button.addActionListener(this);
        this.add(button);
        this.add(new JLabel(label, JLabel.LEFT));
    }

    public void actionPerformed(ActionEvent e) {
        answer = e.getActionCommand();
        dispose();
    }
}

