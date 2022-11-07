package Java.PrimeiraProva.AgendaContatos;

public class Contato {
    
    private String telefoneResid;
    private String celular;
    private String email;

    Contato(String teletoneResid, String celular, String email){

        this.telefoneResid = teletoneResid;
        this.celular =  celular;
        this.email = email;

    }

    public void setTelefoneResid(String telefoneNovo){

        this.telefoneResid = telefoneNovo;

    }

    public String getTelefoneResid(){

        return this.telefoneResid;

    }

    public void setCelular(String celularNovo){

        this.celular = celularNovo;

    }

    public String getCelular(){

        return this.celular;

    }

    public void setEmail(String emailNovo){

        this.email = emailNovo;

    }

    public String getEmail(){

        return this.email;

    }
}
