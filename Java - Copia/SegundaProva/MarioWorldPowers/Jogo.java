package Java.SegundaProva.MarioWorldPowers;

public class Jogo {
    public static void main(String[] args) {
     
       Mario Bros = new Mario();

       InnerInteracao Flor = new Flor();

       Bros.Interage(Flor);

       System.out.println(Bros.getStatus());

    }
}