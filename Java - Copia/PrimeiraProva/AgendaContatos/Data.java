package Java.PrimeiraProva.AgendaContatos;

public class Data {

    private int dia;
    private int mes; 
    private int ano;

    Data(int dia, int mes, int ano){

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }

    public void setDia(int diaNovo){

        this.dia = diaNovo;

    }

    public void setMes(int mesNovo){

        this.mes = mesNovo;

    }

    public void setAno(int anoNovo){

        this.ano = anoNovo;

    }

    public int getDia(){

        return this.dia;

    }

    public int getMes(){

        return this.mes;

    }

    public int getAno(){

        return this.ano;

    }

    public String getData(){

        return this.dia + "/" + this.mes + "/" + this.ano;

    }
}
