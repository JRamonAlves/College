package Java.PrimeiraProva.AgendaContatos;

public class Main {

    public static void main(String[] args) {
     
        Data anivirsario = new Data(13, 05, 2004);
        
        Endereco minhaCasa = new Endereco("Rua Severino Sorares", 70, "Maternidade", "Patos", "Paraíba", "58701380");

        Contato meuContato = new Contato("+558334212423", "+5583987340420", "joseramonalves@gmail.com");

        Pessoa Ramon = new Pessoa("Ramon", anivirsario, meuContato, minhaCasa);

        System.out.println(Ramon.getNome());

        System.out.println(Ramon.getEndereco().getBairro() + ", " + Ramon.getEndereco().getLogradouro() + ", " + Ramon.getEndereco().getNumero());

        System.out.println(Ramon.getContato().getCelular());

        System.out.println(Ramon.getData().getData());

    }
}