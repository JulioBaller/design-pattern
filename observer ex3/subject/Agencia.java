package subject;

import observer.Observer;
import java.util.List;
import java.util.ArrayList;

public class Agencia implements Subject{

private List<Observer> lista = new ArrayList<>();
private String nomeDaVaga;

public Agencia(){
}

public Agencia(String nomeDaVaga){
this.nomeDaVaga = nomeDaVaga;
}

public void addObserver(Observer observer){
if(observer != null){
lista.add(observer);
}
}

public void notificar(){
for(Observer item : lista){
item.notificarNota(this);
}
}

public String getNome() {
    return nomeDaVaga;
}
}
