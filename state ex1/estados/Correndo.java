package estados;

import acao.Acao;

public class Correndo implements Estados{
private String estadoAtual = "Correndo";
private Acao acao;
    
public Correndo(Acao acao){
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
System.out.println("já está correndo");
}

@Override
public void esperar(){
acao.setEstado(new Esperando(acao));
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
