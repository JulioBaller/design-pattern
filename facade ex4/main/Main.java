package main;

import facade.Facade;
import pedidos.ItemPedido;
import pedidos.Produto;
import estoque.Estoque;

public class Main{

public static void main(String[] args) {
Estoque estoque = new Estoque();
Facade facade = new Facade();
facade.carregar();
facade.fachadaAdicionar(new ItemPedido(5, new Produto(123, 11.5, "energético")));
facade.fachadaExibir(estoque.getLista());  
 }      
}