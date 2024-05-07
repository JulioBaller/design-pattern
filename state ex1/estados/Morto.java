package estados;

import acao.Acao;

public class Morto implements Estados{
private String estadoAtual = "Morto";
private Acao acao;
    
public Morto(Acao acao){
this.acao = acao;    
}    


@Override
public void abaixar(){
System.out.println("já está morto");
}

@Override 
public void concluir(){
System.out.println("já está morto");
}

@Override
public void correr(){
System.out.println("já está morto");
}

@Override
public void esperar(){
System.out.println("já está morto");
}

@Override
public void morrer(){
System.out.println("já está morto");
}

@Override
public void pular(){
System.out.println("já está morto"); 
}
}
