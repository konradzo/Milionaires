package com.company;

import java.util.ArrayList;
import java.util.List;

public class QuestionGenerator {

    private int numberOfQuestions;

    private static List<Question> questions = new ArrayList<>();

    static{
        questions.add(new Question("Czy a to a?",true));

        questions.add(new Question("2+5=8?",false));

        questions.add(new Question("Czy cat to pies?",false));

        questions.add(new Question("Czy 2 do poęgi 10 to 1024?",true));

        questions.add(new Question("2+9=12?",false));

    }

    public static List<Question> getQuestions() {
        return questions;
    }

    public static void setQuestions(List<Question> questions) {
        QuestionGenerator.questions = questions;
    }

    public  QuestionGenerator(){
        this.numberOfQuestions = questions.size();
    }


    public QuestionGenerator(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }


    public List<Question> generateQuestions(){
        return questions.subList(0,numberOfQuestions-1);
    }


}