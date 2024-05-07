package random;

import java.util.*;

import acoes.Acoes;
import subject.*;

public class AcoesAleatorias {
   
    public static void Acoes(Subject jogador){

    for(int cont = 0; cont < 3; cont++){

    Random rnd = new Random();
    double r = rnd.nextInt(4);
    
    if(r == 0){
    jogador.addAcoes(Acoes.AVANCAR);
    }
    else if (r == 1){
    jogador.addAcoes(Acoes.RECUAR);
    }
    else if (r == 2){
    jogador.addAcoes(Acoes.ESQUERDA);
    }
    else{
    jogador.addAcoes(Acoes.DIREITA);    
    } 
    }
}
}
