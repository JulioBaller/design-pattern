package estados;

import acao.Acao;

public class Abaixando implements Estados{
private String estadoAtual = "Abaixado";
private Acao acao;
        
public Abaixando(Acao acao){
this.acao = acao;    
}

@Override
public void abaixar(){
System.out.println("Abaixou novamente");
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
acao.setEstado(new Esperando(acao));
}

@Override
public void morrer(){
System.out.println("fim de jogo, você morreu");
}

@Override
public void pular(){
System.out.println("não é possível realizar essa ação agora");
}
}
