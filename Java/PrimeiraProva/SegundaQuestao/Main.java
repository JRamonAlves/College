package Java.PrimeiraProva.SegundaQuestao;

public class Main {
    public static void main(String[] args) {
        
        Estudante pablo = new Estudante("Pablo", 20, 'M', "123.456.789-10");
        Contato contatoPablo = new Contato("pablomedaumponto@gmail.com", "912345678");
        UT programacao = new UT(8, 9, "Programação");
        UT estrutura = new UT(7, 7, "Estrutura");

        pablo.setContato(contatoPablo);
        pablo.setUt1(programacao);
        pablo.setUt2(estrutura);

        System.out.println(pablo.getNome() + ", " + pablo.getIdade());
        System.out.println("Email: " + pablo.getContato().getEmail());
        System.out.println(pablo.calculaMedia());
        System.out.println(pablo.getUt1().getDisciplina() + " e " + pablo.getUt2().getDisciplina());

    }
}