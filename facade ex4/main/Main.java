package main;

import facade.Facade;
import estoque.Estoque;

public class Main{

public static void main(String[] args) {
Estoque estoque = new Estoque();
Facade facade = new Facade();
facade.carregar();
facade.fachadaExibir(estoque.getLista());  
 }      
}