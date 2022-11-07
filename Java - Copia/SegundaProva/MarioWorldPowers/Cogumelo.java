package Java.SegundaProva.MarioWorldPowers;

public class Cogumelo implements InnerInteracao {
    
    public void Interacao(Mario Bros){

        Bros.setPequeno(false);

        Bros.setInteracao(this);
        
        if (Bros.getStatus() == "Cogumelo!") {

            Bros.setPontuacao(Bros.getPontuacao() + 1000);
            
        }else{
            
            Bros.setStatus("Cogumelo!");
    
        }
    }
}
