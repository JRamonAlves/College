package Java.SegundaProva.MarioWorldPowers;

public class Dano implements InnerInteracao {
    
    public void Interacao(Mario Bros){

        if (Bros.getPequeno() == false) {

            Bros.setPequeno(true);

        }else{

            Bros.setVivo(false);

        }

        Bros.setInteracao(null);
        
        Bros.setStatus(null);
        
    }
}
