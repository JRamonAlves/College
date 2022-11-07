package Java.SegundaProva.Primeira;

public class Aula {
    public static void main(String[] args) {
    
        Cachorro pet = new Cachorro("Toddy");
        Gravador rec = new Gravador();

        pet.setNome("Toddy");

        pet.som();

        rec.gracacao(pet);

    }
}