package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class MilionairesFrame extends JFrame implements ActionListener {

    private List<Question> questionsList = new ArrayList<>();

    private QuestionGenerator questionGenerator;

    private int currentQuestionIndex;
    private JLabel questionLabel;
    private User user;
    private JButton yesButton;
    private JButton noButton;

    public QuestionGenerator getQuestionGenerator() {
        return questionGenerator;
    }

    public void setQuestionGenerator(QuestionGenerator questionGenerator) {
        this.questionGenerator = questionGenerator;
    }


    public List<Question> getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(List<Question> questionsList) {
        this.questionsList = questionsList;
    }

    public MilionairesFrame(int width) {
        setSize(width, width);
        setTitle("Millionaires");
        setLayout(new GridLayout(3, 1));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setQuestionGenerator(new QuestionGenerator());
        setQuestionsList(getQuestionGenerator().generateQuestions());
        addLabelAndButtonsToFrame();
        user = new User();
    }


    public void addLabelAndButtonsToFrame() {
        questionLabel = new JLabel(questionsList.get(currentQuestionIndex).getText(), SwingConstants.CENTER);
        add(questionLabel);
        yesButton = new JButton("TAK");
        yesButton.addActionListener(this);
        noButton = new JButton("NIE");
        noButton.addActionListener(this);
        add(yesButton);
        add(noButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MilionairesFrame(500);
            }
        });
    }


    @Override
    public void actionPerformed(ActionEvent e)

    {
        // -2
        JButton clickedButton = (JButton) e.getSource();
        Question currentQuestion = questionsList.get(currentQuestionIndex);
        if (clickedButton == yesButton && currentQuestion.isTrue())
            user.addPoint();
        if (clickedButton == noButton && !currentQuestion.isTrue())
            user.addPoint();
        if (currentQuestionIndex < questionsList.size() - 1) {
            currentQuestionIndex++;
            setLabelTitle();
        } else {
            noButton.setEnabled(false);
            yesButton.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Liczba zdobytych punktów: " + user.getNumberOfPoints());
        }





    }

    public void setLabelTitle() {
        questionLabel.setText(questionsList.get(currentQuestionIndex).getText());
    }

}