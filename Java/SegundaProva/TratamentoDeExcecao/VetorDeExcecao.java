package Java.SegundaProva.TratamentoDeExcecao;

public class VetorDeExcecao{
    public static void main(String[] args) {
     
        int vetor[] = new int[5];
        
        try {

            vetor[0] = 2;
            vetor[1] = 2;
            vetor[2] = 2;
            vetor[3] = 2;
            vetor[4] = 2;
            vetor[5] = 2;
            
        } catch (Exception e) {

            System.err.println(e.getLocalizedMessage());
        
        } finally {

            System.out.println("ok");

        }
    }
} 