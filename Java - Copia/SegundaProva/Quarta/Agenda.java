package Java.SegundaProva.Quarta;

class Agenda{

    private String nome_Pessoa1;
    private String nome_Pessoa2;
    private String endereco;
    private String data_e_hora;
    private String motivo;

    Agenda(String nome_Pessoa1, String nome_Pessoa2, String endereco, String data_e_hora, String motivo){

        this.nome_Pessoa1 = nome_Pessoa1;
        this.nome_Pessoa2 = nome_Pessoa2;
        this.endereco = endereco;
        this.data_e_hora = data_e_hora;
        this.motivo = motivo;

    }

    public String getNome_Pessoa1() {
        return nome_Pessoa1;
    }

    public String getNome_Pessoa2() {
        return nome_Pessoa2;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public String getData_e_hora() {
        return data_e_hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setNome_Pessoa1(String nome_Pessoa1) {
        this.nome_Pessoa1 = nome_Pessoa1;
    }

    public void setNome_Pessoa2(String nome_Pessoa2) {
        this.nome_Pessoa2 = nome_Pessoa2;
    }

    public void setData_e_hora(String data_e_hora) {
        this.data_e_hora = data_e_hora;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

}