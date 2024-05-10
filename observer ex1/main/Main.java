package main;

import subject.Aluno;
import observer.Funcionarios;
import observer.Observer;

public class Main {
 
    public static void main(String[] args) {
        
    Aluno aluno = new Aluno("Julio"); 
    Observer professor = new Funcionarios();
    Observer cordenador = new Funcionarios();
    Observer diretor = new Funcionarios();

    aluno.addObserver(professor);
    aluno.addObserver(cordenador);
    aluno.addObserver(diretor);
    
    aluno.setP1(6);
    aluno.setP2(7);
    aluno.getMedia();
    }
}
