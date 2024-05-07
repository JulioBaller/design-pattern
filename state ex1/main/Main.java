package main;

import acao.Acao;

public class Main {
    
    public static void main(String[] args) {
    Acao acao = new Acao("iniciar jogo"); 
    acao.acaoDeEsperar();
    acao.acaoDePular();
    acao.acaoDeAbaixar();
    acao.acaoDePular();
    acao.acaoDeCorrer();
    acao.acaoDeAbaixar();
    acao.concluirJogo();
    acao.acaoDeCorrer();
    }
}
