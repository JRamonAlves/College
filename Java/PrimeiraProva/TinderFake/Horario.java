package Java.PrimeiraProva.TinderFake;

public class Horario{

    private String turno;
    private int hora;

    Horario(boolean manha, int hora){

        setHorario(manha, hora);

    }

    public void setHorario(boolean manha, int hora){
        
        if (manha) {

            this.hora = hora;
            this.turno = "AM";

        }else{

            this.hora = hora;
            this.turno = "PM";

        }
    }

    public String getHorario(){

        String hora = this.hora + "h " + this.turno;

        return hora;

    }
}
