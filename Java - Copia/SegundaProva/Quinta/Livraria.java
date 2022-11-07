package Java.SegundaProva.Quinta;
import java.util.ArrayList;

public class Livraria {

    ArrayList<Livro> lista = new ArrayList<>();

    public void adicionarLivro(Livro l){
        lista.add(l);
    }

    public ArrayList<Livro> getLivraria(){
        return lista;
    }

    public void procurarLivro(String nome) {
        for (Livro l : lista) {
            if (l.getNome().equals(nome)) {
                System.out.println("Livro encontrado! Nome: " + l.getNome() + " Valor: " + l.getValor());
            }
        }
    }


    public void removerLivro(String nome) {
        for (int x = 0; x < lista.size(); x++) {
            if (lista.get(x).getNome().equals(nome)) {
                System.out.println(lista.get(x).getNome() + " removido!");
                lista.remove(x);
            }
        }
    }

    public void exibir() {
        System.out.println("----------------------------");
        System.out.println("Livros disponì­veis: ");

        for (Livro l : lista) {
            System.out.println("----------------------------");
            System.out.println("Nome: " + l.getNome() + " Valor: " + l.getValor());
        }
    }

}