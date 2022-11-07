package Java.PrimeiraProva.SegundaQuestao;

public class Contato {

    private String email;
    private String celular;

    Contato(){}

    Contato(String email, String celular){

        this.email = email;
        this.celular = celular;

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }
    
}
