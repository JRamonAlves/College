package Java.SegundaProva.Terceira;

public class ContaCorrente extends Conta {

    private double taxa = 12;

    ContaCorrente(String agencia, String conta, double saldo) {
        super(agencia, conta, saldo);
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