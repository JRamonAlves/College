package Java.PrimeiraProva.SegundaQuestao;

public class Estudante {

    private String nome;
    private int idade;
    private char sexo;
    private String cpf;
    private UT ut1;
    private UT ut2;
    private Contato contato;

    Estudante(String nome, int idade, char sexo, String cpf){

        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setUt1(UT ut1) {
        this.ut1 = ut1;
    }

    public void setUt2(UT ut2) {
        this.ut2 = ut2;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public UT getUt1() {
        return ut1;
    }

    public UT getUt2() {
        return ut2;
    }
    
    public Contato getContato() {
        return contato;
    }

    public double calculaMedia() {
        double notaUT1 = (this.ut1.getNota1() + this.ut1.getNota2())/2;
        double notaUT2 = (this.ut2.getNota1() + this.ut2.getNota2())/2;

        double notaFinal = (notaUT1 + notaUT2)/2;

        return notaFinal;
    }

}
