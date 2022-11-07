package Java.PrimeiraProva.SegundaQuestao;

public class UT {

    private double nota1;
    private double nota2;
    private String disciplina;

    UT(String disciplina){

        this.disciplina = disciplina;

    }

    UT(double nota1, double nota2, String disciplina){

        this.nota1 = nota1;
        this.nota2 = nota2;
        this.disciplina = disciplina;

    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public String getDisciplina() {
        return disciplina;
    }
    
}
