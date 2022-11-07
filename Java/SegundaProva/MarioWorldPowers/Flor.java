package Java.SegundaProva.MarioWorldPowers;

public class Flor implements InnerInteracao {
    
    public void Interacao(Mario Bros){

        Bros.setPequeno(false);

        Bros.setInteracao(this);
        
        if (Bros.getStatus() == "Flor de Fogo!") {

            Bros.setPontuacao(Bros.getPontuacao() + 1000);
            
        }else{
            
            Bros.setStatus("Flor de Fogo!");
    
        }
    }
}
