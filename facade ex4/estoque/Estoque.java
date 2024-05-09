package estoque;

import java.util.List;
import java.util.ArrayList;
import pedidos.Produto;

public class Estoque {
private List<Estoque> lista = new ArrayList<>(); 
private Produto produto;
private int quantidade;

public Estoque(){
}

public Estoque(Produto produto, int quantidade){
this.produto = produto;
this.quantidade = quantidade;
}

public List<Estoque> carregarEstoque(Estoque estoque){
if(estoque != null){
lista.add(estoque);
return lista;
}
else{
return lista;    
}
}

public void exibir(){
for(Estoque item : lista){
System.out.println(item.getProduto().getCategoria()+" "+item.getQuantidade());   
}    
}

public Produto getProduto() {
    return produto;
}

public void setProduto(Produto produto) {
    this.produto = produto;
}

public int getQuantidade() {
    return quantidade;
}

public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
}

public List<Estoque> getLista() {
    return lista;
}

public void setLista(List<Estoque> lista) {
    this.lista = lista;
}

}
