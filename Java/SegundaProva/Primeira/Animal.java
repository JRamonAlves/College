package Java.SegundaProva.Primeira;

public class Animal {

    protected String nome;

    Animal(String nome){

        this.nome = nome;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getaNome() {
        return nome;
    }

    public void som(){

        System.out.println("Não existe som!");

    }

}