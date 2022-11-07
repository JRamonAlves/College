package Java.PrimeiraProva.TinderFake;

public class Encontro {

    private String horario;
    private String local;

    Encontro(Pessoa pessoa1, Pessoa pessoa2){

        if (pessoa1.getEndereco() == null || pessoa2.getEndereco() == null){}
        
        else{

            if 
            (pessoa1.getEndereco().getBairro() == pessoa2.getEndereco().getBairro()||
            pessoa1.getEndereco().getRua() == pessoa2.getEndereco().getRua()){

                this.local = "Melhor local do bairro";

            }else if (pessoa1.getEndereco().getCidade() == pessoa1.getEndereco().getCidade()){

                this.local = "Melhor local da cidade";

            }
        }
    }
}