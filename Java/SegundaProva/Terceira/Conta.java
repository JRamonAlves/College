package Java.SegundaProva.Terceira;

public class Conta {

    private String agencia;
    private String conta;
    private Pessoa dono;
    private double saldo;

    Conta(String agencia, String conta, double saldo){

        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        
    }

    public String getAgencia() {
        return agencia;
    }

    public String getConta() {
        return conta;
    }

    public Pessoa getDono() {
        return dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected void adicionaSaldo(double valorAdicional){}

    protected void reduzSaldo(double valorReducional){}
}