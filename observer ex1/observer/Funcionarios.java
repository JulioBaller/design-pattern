package observer;

import subject.Aluno;

public class Funcionarios implements Observer{

@Override
public void notificarNota(Aluno aluno){
System.out.println("O Aluno : "+ aluno.getNome() +" ficou com "+aluno.getMedia());
}
}
