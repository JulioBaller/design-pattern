package main;

import acoes.Acoes;
import observer.*;
import subject.*;
import random.AcoesAleatorias;

public class ExemploObserver {
    public static void main(String[] args) {
        Subject jogador = NaveJogador.instancia();
        AcoesAleatorias AC = new AcoesAleatorias();
        Observer naveInimiga1=new NaveInimiga("Nave1", jogador);
        AC.Acoes(jogador);
        AC.Acoes(jogador);
        Observer naveInimiga2=new NaveInimiga("Nave2", jogador);
        AC.Acoes(jogador);
    }  
}
