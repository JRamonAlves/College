package Java.SegundaProva.Terceira;

public class Cliente {
    public static void main(String[] args) {
     
        Pessoa pablo = new Pessoa("Pablo");

        Pessoa ramon = new Pessoa("Ramon");

        ContaCorrente contaPablo = new ContaCorrente("1234", "123456-0",5000);

        ContaPoupanca contaRamon = new ContaPoupanca("1234", "654321-0", 2000);

        pablo.setConta(contaPablo);
        ramon.setConta(contaRamon);

        pablo.transfere(ramon, 80);

        System.out.println(ramon.getConta().getSaldo());

    }
}