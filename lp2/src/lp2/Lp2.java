package lp2;

import java.util.ArrayList;
import java.util.Scanner;
import jogadoresliga.LeitorDadosJogadores;

public class Lp2 {

    public static void main(String[] args) {
        LeitorDadosJogadores leitor = new LeitorDadosJogadores();
        Scanner sc = new Scanner(System.in);
        String[] dados = leitor.ler();
        int op = -1;
        while (op < 0 || op > 1) {
            System.out.println("Escolha uma opção");
            System.out.println("(1) Listar confederações");
            System.out.println("(0) SAIR");
            op = sc.nextInt();
        }
        switch (op) {
            case 1:
                getConfederacoes();
                break;
            case 0:
                return;
        }
    }

    public static void getConfederacoes() {
        Confederacao c = new Confederacao();
        Scanner sc = new Scanner(System.in);
        ArrayList<String> confederacoes = c.getConfederacoes();
        int index = 0;
        System.out.println("Escolha uma opção");
        int opConf = -1;
        while (opConf < 0 || opConf > confederacoes.size()) {
            for (String confederacao : confederacoes) {
                index++;
                System.out.println(index + " - " + confederacao);
            }
            System.out.println("0 - Voltar");
            opConf = sc.nextInt();
        }
    }
}

//        for (String dado : dados) {
//            System.out.println("Dados do jogador: " + dado);
//        }
//        System.out.println("Quantidade de registros: " + dados.length);
