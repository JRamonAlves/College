package Java.SegundaProva.MarioWorldPowers;

public class Pena implements InnerInteracao {
    
    public void Interacao(Mario Bros){

        Bros.setPequeno(false);

        Bros.setInteracao(this);
        
        if (Bros.getStatus() == "Pena Voadora!") {

            Bros.setPontuacao(Bros.getPontuacao() + 1000);
            
        }else{
            
            Bros.setStatus("Pena Voadora!");
    
        }
    }
}