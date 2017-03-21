import java.util.Vector;

public class Disciplina {

  private String nume;

    private Vector  Exam;
    private Vector  Profesor;


  public String getNume() {
    return nume;
  }

  public void setNume(String nume) {
    this.nume = nume;
  }

  public Vector getExam() {
    return Exam;
  }

  public void setExam(Vector exam) {
    Exam = exam;
  }

  public Vector getProfesor() {
    return Profesor;
  }

  public void setProfesor(Vector profesor) {
    Profesor = profesor;
  }
}