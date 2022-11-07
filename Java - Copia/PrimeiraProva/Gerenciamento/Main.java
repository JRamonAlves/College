package Java.PrimeiraProva.Gerenciamento;

class Main { 
    public static void main(String[] args) {
        
        Empresa google = new Empresa("Google", "123456789");

        Departamento financeiro = new Departamento("Financeiro");

        Funcionario Gabryel = new Funcionario("Gabryel", "13/09/2020", 1257.58);

        Funcionario Lucas = new Funcionario("Lucas", "13/09/2020", 123456.78);

        google.appendDepartamento(financeiro);
        
        google.getDepartamentoNomes();

        google.getDepartamentos()[0].appendEquipe(Gabryel);

        google.getDepartamentos()[0].appendEquipe(Lucas);

        google.getDepartamentos()[0].deleteEquipe(Gabryel);

        google.getDepartamentos()[0].getEquipeNomes();

    }
}