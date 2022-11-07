package Java.PrimeiraProva.Gerenciamento;

public class Empresa {
    
    private String nome;
    private String CNPJ;
    private Departamento[] departamentos = new Departamento[10];

    Empresa(String nome, String CNPJ){

        this.nome = nome;
        this.CNPJ = CNPJ;

    }

    public String getNome(){

        return this.nome;

    }

    public String getCNPJ(){

        return this.CNPJ;

    }

    public void setNome(String nome){

        this.nome = nome;

    }

    public void setCNPJ(String CNPJ){

        this.CNPJ = CNPJ;

    }


    
    public Departamento[] getDepartamentos(){

        return this.departamentos;

    }

    public void getDepartamentoNomes(){

        String[] nome = new String[this.departamentos.length];
        int[] posicao = new int[this.departamentos.length];

        for (int i = 0; i < nome.length; i++) {

            if (this.departamentos[i] != null){
                
                nome[i] = this.departamentos[i].getNome();
                posicao[i] = i;
            
            }
            
        }

        for (int i = 0; i < nome.length; i++) {
            
            if (this.departamentos[i] != null){
            
                System.out.println(nome[i] + " Número: " + posicao[i]);
            
            }
        }
    }

    public void appendDepartamento(Departamento departamento){

        int posicao = 11;
        
        for (int i = 0; i < this.departamentos.length; i++) {
            
            if (this.departamentos[i] == null && this.departamentos[i] != departamento && posicao > i){

                posicao = i;
            
            }
        }
        
        if (posicao <= 10) {

            this.departamentos[posicao] = departamento;
            
        }
    }

    public void deleteDepartamento(Departamento departamento){

        for (int i = 0; i < this.departamentos.length; i++) {
            
            if (this.departamentos[i] == departamento){

                this.departamentos[i] = null;

            }
        }
    }    

    public Boolean searchDepartamento(Departamento departamento){

        Boolean existe = false;

        for (int i = 0; i < this.departamentos.length; i++) {
            
            if (this.departamentos[i] == departamento){

                existe = true;

            }
        }

        return existe;

    }

}