package Java.SegundaProva.Quarta.TesteColecoes;

import java.util.ArrayList;

public class Colecoes{
    public static void main(String[] args) {

        ArrayList<String> variavel = new ArrayList<String>();

        variavel.add("Pablo");
        
        variavel.add("Ramon");
        
        variavel.add("Arthur");

        variavel.remove("Ramon");

        System.out.println(variavel.size());

        System.out.println("A lista está vazia ? " + variavel.isEmpty());

        for (int i = 0; i < variavel.size(); i++) {

            System.out.println(variavel.get(i));
            
        }

        for (String nome : variavel) {

            System.out.println(nome);
            
        }
    }
}