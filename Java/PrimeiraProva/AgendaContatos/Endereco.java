package Java.PrimeiraProva.AgendaContatos;

public class Endereco {

    private String logradouro;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    Endereco(String logradouro, int numero, String bairro, String cidade, String estado, String cep){

        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;

    }

    public void setlogradouro(String logradouroNovo){

        this.logradouro = logradouroNovo;

    }

    public void setNumero(int numeroNovo){

        this.numero = numeroNovo;

    }

    public void setBairro(String bairroNovo){

        this.bairro = bairroNovo;

    }

    public void setCidade(String cidadeNova){

        this.cidade = cidadeNova;

    }

    public void setEstado(String estadoNovo){

        this.estado = estadoNovo;

    }

    public void setCEP(String CEPNovo){

        this.cep = CEPNovo;

    }

    public String getLogradouro(){

        return this.logradouro;

    }

    public int getNumero(){

        return this.numero;

    }

    public String getBairro(){

        return this.bairro;

    }
    
    public String getCidade(){

        return this.cidade;

    }

    public String getEstado(){

        return this.estado;

    }

    public String getCEP(){

        return this.cep;

    }
}
