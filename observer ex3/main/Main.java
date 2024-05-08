package main;

import observer.*;
import subject.*;

public class Main {
    
    public static void main(String[] args) {
    Subject agencia = new Agencia("Desenvolvedor de sistemas");
    Observer assinante1 = new Assinantes();
    Observer assinante2 = new Assinantes();
    Observer assinante3 = new Assinantes();
    agencia.addObserver(assinante1);
    agencia.addObserver(assinante2);
    agencia.addObserver(assinante3);
    agencia.notificar();
    }
}
