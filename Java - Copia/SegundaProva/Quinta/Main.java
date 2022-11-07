package Java.SegundaProva.Quinta;

public class Main {
    public static void main(String[] args) {

        Livraria livraria = new Livraria();

        Livro l1 = new Livro("Livro A", 100);
        Livro l2 = new Livro("Livro B", 200);
        Livro l3 = new Livro("Livro C", 300);
        Livro l4 = new Livro("Livro D", 400);
        Livro l5 = new Livro("Livro E", 500);


        livraria.adicionarLivro(l1);
        livraria.adicionarLivro(l2);
        livraria.adicionarLivro(l3);
        livraria.adicionarLivro(l4);
        livraria.adicionarLivro(l5);

        livraria.procurarLivro("Livro B");

        livraria.removerLivro("Livro C");

        livraria.exibir();

    }
    
}
