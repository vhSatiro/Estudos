package lp2;
public class Jogador {
    private String nomeJogador;
    private String dataNascimento;
    private String localNascimento;
    private Time time;

    public Jogador(String nomeJogador, String dataNascimento, String localNascimento, Time time) {
        this.nomeJogador = nomeJogador;
        this.dataNascimento = dataNascimento;
        this.localNascimento = localNascimento;
        this.time = time;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }
    
}
