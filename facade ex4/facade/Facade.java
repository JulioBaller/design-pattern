package facade;

import pedidos.*;
import estoque.Estoque;
import java.util.List;

public class Facade {

public Facade(){
}

public static void carregar(){
Pedido pedido = new Pedido(); 
ItemPedido itemPedido1 = new ItemPedido(5, new Produto(123, 12.5, "salgado"));
ItemPedido itemPedido2 = new ItemPedido(5, new Produto(231, 12.5, "salgado"));
ItemPedido itemPedido3 = new ItemPedido(5, new Produto(312, 12.5, "salgado"));
ItemPedido itemPedido4 = new ItemPedido(5, new Produto(213, 12.5, "salgado"));
ItemPedido itemPedido5 = new ItemPedido(5, new Produto(321, 12.5, "salgado"));
pedido.adicionar(itemPedido1);  
pedido.adicionar(itemPedido2); 
pedido.adicionar(itemPedido3); 
pedido.adicionar(itemPedido4); 
pedido.adicionar(itemPedido5); 
}

public static void fachadaAdicionar(ItemPedido itemPedido){
Pedido pedido = new Pedido();
pedido.adicionar(itemPedido);
}

public static void fachadaRemover(List<Estoque> lista, Produto produto, int quantidade){
Pedido pedido = new Pedido();
pedido.remover(lista, produto, quantidade);
} 

public static void fachadaExibir(List<Estoque> lista){
    if(lista == null){
        System.out.println("fffffffffffff");
        }
for(Estoque item : lista){
System.out.println(item.getProduto()+" "+item.getQuantidade());   
}
}
}
