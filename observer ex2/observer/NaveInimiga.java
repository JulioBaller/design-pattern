package observer;

import acoes.Acoes;
import subject.*;

public class NaveInimiga implements Observer {
    private String nome;
    public NaveInimiga() {
    }
    public NaveInimiga(String nome, Subject subject) {
        this.nome = nome;
        subject.addObserver(this);
    }
    @Override
    public void update(Acoes acoes) {
        System.out.println(nome + " " + acoes);
    }
}

