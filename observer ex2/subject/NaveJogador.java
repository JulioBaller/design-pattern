package subject;

import acoes.Acoes;
import observer.*;
import java.util.LinkedList;
import java.util.List;

public class NaveJogador implements Subject{
    private List<Observer> observadores=new LinkedList<>();
    private List<Acoes> listaAcoes=new LinkedList<>();
    private int index=-1; 
    private static NaveJogador uniqueInstance;

    private NaveJogador(){
    }

    public static NaveJogador instancia(){
    if(uniqueInstance == null){
    uniqueInstance = new NaveJogador();   
    } 
    return uniqueInstance;   
    }

    @Override
    public void addObserver(Observer observer) {
        observadores.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        for(int cont = 0; cont < observadores.size(); cont++){
        if(observadores.get(cont) == observer){
        observadores.remove(cont);
        }    
        }
    }

    @Override
    public void addAcoes(Acoes acoes) {
        listaAcoes.add(acoes);
        index++;
        notificar();
    }
    @Override
    public void notificar() {
       for(Observer observer:observadores){
         observer.update(listaAcoes.get(index));
       }
    }


}
