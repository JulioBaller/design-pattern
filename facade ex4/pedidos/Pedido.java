package pedidos;

import java.util.List;
import estoque.Estoque;

public class Pedido {
    
private double valorTotal;
private Estoque estoque = new Estoque();

public List<Estoque> adicionar(List<Estoque> lista, ItemPedido item){
if(item != null){
lista = estoque.carregarEstoque(new Estoque(item.getProduto(), item.getQuantidade()));
return lista;
}
else{
return lista;    
}
}

public List<Estoque> remover(List<Estoque> estoque, String produto, int quantidade){
int cont = 0;
for(Estoque item : estoque){
if(item.getProduto().getCategoria().equalsIgnoreCase(produto)){
    
if(item.getQuantidade() > quantidade ){
    
estoque.get(cont).setQuantidade(item.getQuantidade() - quantidade); 
}  
else{
estoque.get(cont).setQuantidade(0);    
}  
}
cont++;
}
return estoque;
}

public double calcularTotal(List<Estoque> lista){
for(Estoque item : lista){
valorTotal = valorTotal + item.getProduto().getPreco();
}
return valorTotal;
}

public void cupomFiscal(){

}

}
