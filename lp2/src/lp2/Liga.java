package lp2;

import java.util.ArrayList;

public class Liga {

    private String nomeLiga;
    private Confederacao confederacao;

    public Liga(String nomeLiga, Confederacao confederacao) {
        this.nomeLiga = nomeLiga;
        this.confederacao = confederacao;
    }

    public String getNomeLiga() {
        return nomeLiga;
    }

    public void setNomeLiga(String nomeLiga) {
        this.nomeLiga = nomeLiga;
    }

    public ArrayList<Jogo> organizarJogos() {
        ArrayList<Jogo> jogos = new ArrayList();
        return jogos;
    }
}
