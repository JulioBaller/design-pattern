package observer;

import subject.Aluno;

public class Funcionarios implements Observer{

@Override
public void notificarNota(Aluno aluno){
if(aluno.getP2() == -1){
System.out.println("O Aluno : "+aluno.getNome()+" tirou "+aluno.getP1()+" na P1");
System.out.println();
}
else{
System.out.println("O Aluno : "+ aluno.getNome() +" tirou com "+aluno.getP2()+" na P2");
System.out.println("O Aluno : "+aluno.getNome()+" ficou com "+aluno.getMedia()+" de média");
System.out.println();
}
}
}
