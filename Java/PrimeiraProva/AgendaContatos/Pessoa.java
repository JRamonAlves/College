package Java.PrimeiraProva.AgendaContatos;

public class Pessoa {
    
    private String nome;
    private Data dataNasc;
    private Contato contato;
    private Endereco endereco;

    Pessoa(String nome, Data dataNasc, Contato contato, Endereco endereco){

        this.nome = nome; 
        this.dataNasc = dataNasc;
        this.contato = contato;
        this.endereco = endereco;

    }

    public void setNome(String nomeNovo){

        this.nome = nomeNovo;

    }

    public void setDataNasc(Data dataNova){

        this.dataNasc = dataNova;

    }

    public void setContato(Contato contatoNovo){

        this.contato = contatoNovo;

    }

    public void setEndereco(Endereco enderecoNovo){

        this.endereco = enderecoNovo;

    }

    public String getNome(){

        return this.nome;

    }

    public Data getData(){

        return this.dataNasc;

    }

    public Contato getContato(){

        return this.contato;
        
    }

    public Endereco getEndereco(){

        return this.endereco;

    }

}
