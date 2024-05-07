package estados;

import acao.Acao;

public class Esperando implements Estados{
private String estadoAtual = "Esperando";
private Acao acao;
    
public Esperando(Acao acao){
this.acao = acao;    
}

@Override
public void abaixar(){
acao.setEstado(new Abaixando(acao));
}

@Override 
public void concluir(){
acao.setEstado(new Concluido(acao));
System.out.println("parabens o jogo foi concluído");
}

@Override
public void correr(){
acao.setEstado(new Correndo(acao));
}

@Override
public void esperar(){
System.out.println("já está esperando");
}

@Override
public void morrer(){
System.out.println("fim de jogo, você morreu");
}

@Override
public void pular(){
acao.setEstado(new Pulando(acao));
}
}
