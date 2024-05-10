package observer;

import subject.Agencia;

public class Assinantes implements Observer{

@Override
public void notificarVaga(Agencia agencia){
System.out.println("uma vaga para "+agencia.getNome()+" está disponível");
} 
    
}
