package facade;

import pedidos.*;
import estoque.Estoque;
import java.util.List;
import java.util.ArrayList;

public class Facade {

private List<Estoque> lista = new ArrayList<>();
Estoque estoque = new Estoque();

public Facade(){
}

public void carregar(){

Pedido pedido = new Pedido(); 
ItemPedido itemPedido1 = new ItemPedido(5, new Produto(123, 17.5, "macarrão"));
ItemPedido itemPedido2 = new ItemPedido(5, new Produto(231, 12.5, "refrigerante"));
ItemPedido itemPedido3 = new ItemPedido(5, new Produto(312, 10.5, "suco"));
ItemPedido itemPedido4 = new ItemPedido(5, new Produto(213, 7.5, "bolacha"));
ItemPedido itemPedido5 = new ItemPedido(5, new Produto(321, 24.5, "carne"));
estoque.setLista(pedido.adicionar(lista, itemPedido1));  
estoque.setLista(pedido.adicionar(lista, itemPedido2)); 
estoque.setLista(pedido.adicionar(lista, itemPedido3)); 
estoque.setLista(pedido.adicionar(lista, itemPedido4)); 
estoque.setLista(pedido.adicionar(lista, itemPedido5)); 
}

public void fachadaAdicionar(ItemPedido itemPedido){
Pedido pedido = new Pedido();
estoque.setLista(pedido.adicionar(lista, itemPedido));
}

public void fachadaRemover(Produto produto, int quantidade){
Pedido pedido = new Pedido();
estoque.setLista(pedido.remover(estoque.getLista(), produto, quantidade));
} 

public void fachadaExibir(List<Estoque> lista){
estoque.exibir();
}
}
