package Java.PrimeiraProva.Gerenciamento;

public class Departamento {

    private String nome;
    private Funcionario gerente;
    private Funcionario equipe[] = new Funcionario[10];

    Departamento(String nome){

        this.nome = nome;

    }

    public void setNome(String nome){

        this.nome = nome;

    }

    public String getNome(){

        return this.nome;

    }

    public Funcionario getGerente(){

        return this.gerente;

    }

    public void setGerente(Funcionario gerenteNovo){

        this.gerente = gerenteNovo;

    }

    public void aumentoFuncionario(Funcionario funcionario){

        for (int i = 0; i < this.equipe.length; i++) {
            
            if (this.equipe[i] == funcionario){

                double salarioNovo = this.equipe[i].getSalario() * 1.1;

                this.equipe[i].setSalario(salarioNovo);

            }
        }

    }
    
    public void aumentoEquipe(){

        for (int i = 0; i < equipe.length; i++) {
            
            double salarioNovo = this.equipe[i].getSalario() * 1.1;

            this.equipe[i].setSalario(salarioNovo);

        }
    }

    public void aumentoDepartamento(){

            double salarioGerente = this.gerente.getSalario() * 1.1;

            this.gerente.setSalario(salarioGerente);

        for (int i = 0; i < equipe.length; i++) {
            
            double salarioNovo = this.equipe[i].getSalario() * 1.1;

            this.equipe[i].setSalario(salarioNovo);

        }
    }



    public Funcionario[] getEquipeFuncionarios() {

        return this.equipe;
    }

    public void getEquipeNomes(){

        String[] nome = new String[this.equipe.length];
        int[] posicao = new int[this.equipe.length];

        for (int i = 0; i < nome.length; i++) {

            if (this.equipe[i] != null){
                
                nome[i] = this.equipe[i].getNome();
                posicao[i] = i;
            
            }
            
        }

        for (int i = 0; i < nome.length; i++) {
            
            if (this.equipe[i] != null){
            
                System.out.println(nome[i] + " Número: " + posicao[i]);
            
            }
        }
    }
    
    public void appendEquipe(Funcionario funcionarioNovo){

        int posicao = 11;
        
        for (int i = 0; i < this.equipe.length; i++) {
            
            if (this.equipe[i] == null && this.equipe[i] != funcionarioNovo && posicao > i){

                posicao = i;
            
            }
        }
        
        if (posicao <= 10) {

            this.equipe[posicao] = funcionarioNovo;
            
        }
    }

    public void deleteEquipe(Funcionario funcionario){

        for (int i = 0; i < this.equipe.length; i++) {
            
            if (this.equipe[i] == funcionario){

                this.equipe[i] = null;

            }
        }
    }

    public Boolean searchFuncionario(Funcionario funcionario){

        Boolean existe = false;

        for (int i = 0; i < this.equipe.length; i++) {
            
            if (this.equipe[i] == funcionario){

                existe = true;

            }
        }

        return existe;
    }

}