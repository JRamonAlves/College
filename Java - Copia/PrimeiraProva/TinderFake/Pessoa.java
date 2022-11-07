package Java.PrimeiraProva.TinderFake;

public class Pessoa {

    private String nome;
    private int idade;
    private Endereco endereco;
    private Horario horarioDisponivel;

    Pessoa(String nome, int idade){

        this.nome = nome;
        this.idade = idade;

    }

    public void setNome(String nome){

        this.nome = nome;

    }

    public void setIdade(int idade){

        this.idade = idade;

    }

    public String getNome(){

        return this.nome;

    }

    public int getIdade(){

        return this.idade;

    }

    public void setEndereco(String cidade, String rua, int numero, String bairro){

        this.endereco = new Endereco(cidade, rua, numero, bairro);

    }

    public Endereco getEndereco(){

        return this.endereco;

    }

    public void setHorarioDisponivel(boolean manha, int hora){

        this.horarioDisponivel = new Horario(manha, hora);

    }

    public Horario getHorarioDisponivel(){

        return this.horarioDisponivel;

    }
    
}
