package observer;

import subject.Agencia;

public class Assinantes implements Observer{

@Override
public void notificarNota(Agencia agencia){
System.out.println("uma vaga para "+agencia.getNome()+" está disponível");
} 
    
}
