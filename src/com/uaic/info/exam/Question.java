package com.uaic.info.exam;


public class Question {

    private String intrebare;
    private String raspuns;

    public Question(String intrebare, String raspuns) {
        this.intrebare = intrebare;
        this.raspuns = raspuns;
    }

    @Override
    public boolean equals(Object obj) {
        return this.intrebare.equals(((Question)obj).intrebare)
                && this.raspuns.equals(((Question)obj).raspuns);
    }

    public String getIntrebare() {
        return intrebare;
    }

    public void setIntrebare(String intrebare) {
        this.intrebare = intrebare;
    }

    public String getRaspuns() {
        return raspuns;
    }

    public void setRaspuns(String raspuns) {
        this.raspuns = raspuns;
    }
}
