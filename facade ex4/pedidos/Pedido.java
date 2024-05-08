package pedidos;

import java.util.List;
import java.util.ArrayList;
import estoque.Estoque;

public class Pedido {
    
private double valorTotal;
private List<ItemPedido> lista = new ArrayList<>();
private Estoque estoque= new Estoque();

public void adicionar(ItemPedido item){
if(item != null){
estoque.carregarEstoque(new Estoque(item.getProduto(), item.getQuantidade()));
}
}

public List<Estoque> remover(List<Estoque> estoque, Produto produto, int quantidade){
int cont = 0;
for(Estoque item : estoque){
if(item.getProduto() == produto){
if(item.getQuantidade() <= quantidade ){
estoque.get(cont).setQuantidade(--quantidade);    
}  
else{
estoque.get(cont).setQuantidade(0);    
}  
}
}
return estoque;
}

public double calcularTotal(){
for(ItemPedido item : lista){
valorTotal = valorTotal + item.getProduto().getPreco();
}
return valorTotal;
}

public void cupomFiscal(){

}

}
