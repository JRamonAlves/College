package Java.SegundaProva.Terceira;

public class ContaPoupanca extends Conta{

    private double CDI = 0.02;
    private double taxa = 22;

    ContaPoupanca(String agencia, String conta, double saldo) {
        super(agencia, conta, saldo);
    }

    public void poupançaCDI() {

        super.setSaldo(super.getSaldo()*CDI);
        
    }
    
    @Override
    public void adicionaSaldo(double valorAdicional){

        super.setSaldo(super.getSaldo() + valorAdicional);

    }

    @Override
    public void reduzSaldo(double valorReducional){

        super.setSaldo(super.getSaldo() - valorReducional - taxa);

    }

}