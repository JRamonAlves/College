package Java.SegundaProva.Terceira;

public class Pessoa {

    private String nome;
    private Conta conta;
    
    Pessoa(String nome){

        this.nome = nome;

    }   

    public String getNome() {
        return nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public void transfere(Pessoa destinatario, float valor){

        this.conta.reduzSaldo(valor);
        destinatario.getConta().adicionaSaldo(valor);        
    }

}