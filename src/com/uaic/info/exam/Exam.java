package com.uaic.info.exam;


import java.util.ArrayList;
import java.util.List;

public class Exam {

    private List<Question> questions;


    public Exam() {
        this.questions = new ArrayList<Question>();
    }

    public void addQuestion(Question q) {
        this.questions.add(q);
    }

    public List<Question> getQuestions() {
        return questions;
    }   
}
