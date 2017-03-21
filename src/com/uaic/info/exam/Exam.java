package com.uaic.info.exam;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Exam {

    private List<Question> questions;
    private int id;
    private Disciplina disciplina;

    private Date oraStart;
    private Date oraFinal;


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
