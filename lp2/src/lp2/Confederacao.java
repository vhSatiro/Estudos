package lp2;

import java.util.ArrayList;
import java.util.List;
import jogadoresliga.LeitorDadosJogadores;

public class Confederacao {
    private ArrayList<Liga> ligas= new ArrayList();
    public ArrayList<String> getConfederacoes() {
        LeitorDadosJogadores leitor = new LeitorDadosJogadores();
        String[] dados = leitor.ler();
        List<String> confederacoes = new ArrayList<>();
        for (String dado : dados) {
            String[] info = dado.split(";");
            String confederacao = info[0];
            if (!confederacoes.contains(confederacao)) {
                confederacoes.add(confederacao);
            }
        }
        return (ArrayList<String>) confederacoes;
    }
}
