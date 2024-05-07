package estados;

import acao.Acao;

public class Pulando implements Estados{
private String estadoAtual = "Pulando";
private Acao acao;
    
public Pulando(Acao acao){
this.acao = acao;    
} 


@Override
public void abaixar(){
System.out.println("não é possível realizar essa ação agora");
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
System.out.println("Pulou novamente");
}
}
