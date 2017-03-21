package com.uaic.info.test;


public class Question {
    String intrebare;
    String raspuns;

    public Question(String intrebare, String raspuns) {
        this.intrebare = intrebare;
        this.raspuns = raspuns;
    }

    @Override
    public boolean equals(Object obj) {
        return this.intrebare.equals(((Question)obj).intrebare)
                && this.raspuns.equals(((Question)obj).raspuns);
    }
}
