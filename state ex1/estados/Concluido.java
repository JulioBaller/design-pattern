package estados;

import acao.Acao;

public class Concluido implements Estados{
private String estadoAtual = "Concluido";
private Acao acao;
    
public Concluido(Acao acao){
this.acao = acao;    
}    

@Override
public void abaixar(){
System.out.println("o jogo já foi concluído");
}

@Override 
public void concluir(){
System.out.println("o jogo já foi concluído");
}

@Override
public void correr(){
System.out.println("o jogo já foi concluído");
}

@Override
public void esperar(){
System.out.println("o jogo já foi concluído");
}

@Override
public void morrer(){
System.out.println("o jogo já foi concluído");
}

@Override
public void pular(){
System.out.println("o jogo já foi concluído");
}
}
