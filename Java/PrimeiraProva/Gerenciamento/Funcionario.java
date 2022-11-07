package Java.PrimeiraProva.Gerenciamento;

public class Funcionario {
    
    private String nome;
    private String dataDeAdmissao;
    private double salario;
    private Departamento departamento;
    private String funcao;
    
    Funcionario(String nome, String data, double salario){

        this.nome = nome;
        this.dataDeAdmissao = data;
        this.salario = salario;

    }

    public void setSalario(double salario){

        this.salario = salario;

    }

    public void setDepartamento(Departamento departamento){

        this.departamento = departamento;

    }

    public void setFuncao(String funcao){

        this.funcao = funcao;

    }

    public String getNome(){

        return this.nome;

    }

    public String getDataDeAdmissao(){

        return this.dataDeAdmissao;

    }

    public double getSalario(){

        return this.salario;

    }

    public Departamento getDepartamento(){

        return this.departamento;

    }

    public String getFuncao(){ 

        return this.funcao;

    }

}