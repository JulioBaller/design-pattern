package facade;

import pedidos.*;
import estoque.Estoque;
import java.util.List;

public class Facade {

private Estoque estoque = new Estoque();
private Pedido pedido = new Pedido();

public Facade(){
}

public void carregar(){

ItemPedido itemPedido1 = new ItemPedido(5, new Produto(123, 17.5, "macarrão"));
ItemPedido itemPedido2 = new ItemPedido(5, new Produto(231, 12.5, "refrigerante"));
ItemPedido itemPedido3 = new ItemPedido(5, new Produto(312, 10.5, "suco"));
ItemPedido itemPedido4 = new ItemPedido(5, new Produto(213, 7.5, "bolacha"));
ItemPedido itemPedido5 = new ItemPedido(5, new Produto(321, 24.5, "carne"));
estoque.setLista(pedido.adicionar(estoque.getLista(), itemPedido1));  
estoque.setLista(pedido.adicionar(estoque.getLista(), itemPedido2)); 
estoque.setLista(pedido.adicionar(estoque.getLista(), itemPedido3)); 
estoque.setLista(pedido.adicionar(estoque.getLista(), itemPedido4)); 
estoque.setLista(pedido.adicionar(estoque.getLista(), itemPedido5)); 
}

public void fachadaAdicionar(ItemPedido itemPedido){
estoque.setLista(pedido.adicionar(estoque.getLista(), itemPedido));
}

public void fachadaRemover(Produto produto, int quantidade){
estoque.setLista(pedido.remover(estoque.getLista(), produto, quantidade));
} 

public void fachadaExibir(List<Estoque> lista){
estoque.exibir();
}
}
