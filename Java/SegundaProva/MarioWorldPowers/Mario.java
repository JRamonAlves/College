package Java.SegundaProva.MarioWorldPowers;

public class Mario {

    private Boolean pequeno = true;
    private Boolean vivo = true;
    private int pontuacao = 0;
    private String Status = null;
    private InnerInteracao interacao = null;

    Mario(){}

    public Boolean getPequeno() {
        return pequeno;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public InnerInteracao getInteracao() {
        return interacao;
    }

    public Boolean getVivo() {
        return vivo;
    }

    public String getStatus() {
        return Status;
    }

    public void setPequeno(Boolean pequeno) {
        this.pequeno = pequeno;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public InnerInteracao setInteracao(InnerInteracao interacao){

        return interacao;

    }
     
    public void Interage(InnerInteracao interacao) {
        interacao.Interacao(this);
    }

    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }

    public void setStatus(String status) {
        Status = status;
    }
 
}