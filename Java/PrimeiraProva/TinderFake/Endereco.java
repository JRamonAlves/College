package Java.PrimeiraProva.TinderFake;

public class Endereco {

    private String bairro;
    private String rua;
    private int numero;
    private String cidade;

    Endereco(String cidade, String rua, int numero, String bairro){
        
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;

    }

    public String getEndereco(){

        String endereco = "Cidade: " + this.cidade + "\nRua: " + this.rua + "\n Número: " + this.numero + "\nBairro: " + 
        this.bairro;

        return endereco;

    }

    public String getBairro(){

        return this.bairro;

    }

    public String getRua(){

        return this.rua;

    }

    public int getNumero(){

        return this.numero;

    }

    public String getCidade(){

        return this.cidade;

    }

    public void setBairro(String bairro){

        this.bairro = bairro;

    }

    public void setRua(String rua){

        this.rua = rua;

    }

    public void setNumero(int numero){

        this.numero = numero;

    }

    public void setCidade(String cidade){

        this.cidade = cidade;

    }

}
