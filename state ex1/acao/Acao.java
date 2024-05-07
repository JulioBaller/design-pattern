package acao;

import estados.*;

public class Acao {
    
    private String descricao;
    private Estados estado;

    public Acao(String descricao) {
     estado = new Esperando(this);
     this.descricao=descricao;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
        System.out.println(getEstado());
    }
    
    public void acaoDeAbaixar(){
      estado.abaixar();
    }
    
    public void concluirJogo(){
      estado.concluir();
    }
    
    public void acaoDeCorrer(){
     estado.correr();
    }

    public void acaoDeEsperar(){
    estado.esperar();
    }

    public void acaoDeMorrer(){
    estado.morrer();
    }
    
    public void acaoDePular(){
    estado.pular();
    }

}
