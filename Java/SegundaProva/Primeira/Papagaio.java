package Java.SegundaProva.Primeira;

public class Papagaio extends Animal{

    Papagaio(String nome){

        super(nome);

    }
    
    public void som(String frase){

        System.out.println(frase);

    }

    @Override public void som(){

        System.out.println("arara");

    }

    public void som(int numero){

        System.out.println(numero);

    }

}
