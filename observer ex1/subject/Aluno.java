package subject;

import observer.Observer;

import java.util.List;
import java.util.ArrayList;

public class Aluno implements Subject{

private String nome;
private double p1 = -1;
private double p2 = -1;
private double media;
private List<Observer> lista= new ArrayList<>();

public Aluno(String nome){
this.nome = nome;    
}

@Override
public void addObserver(Observer observer){
lista.add(observer);
}

public double getP1() {
    return p1;
}

public void setP1(double p1) {
    this.p1 = p1;
    notificar();
}

public double getP2() {
    return p2;
}

public void setP2(double p2) {
    this.p2 = p2;
    notificar();
}

public String getNome() {
    return nome;
}

@Override
public void notificar(){
for(Observer item:lista){
item.notificarNota(this);
}
}

public double getMedia(){
return media = (getP1() + getP2()) /2;
}
}