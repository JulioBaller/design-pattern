package estoque;

import java.util.List;
import java.util.ArrayList;
import pedidos.Produto;

public class Estoque {
private List<Estoque> lista = new ArrayList<>(); 
private Produto produto;
private int quantidade;

public Estoque(){
lista = new ArrayList<>();
}

public Estoque(Produto produto, int quantidade){
this.produto = produto;
this.quantidade = quantidade;
}

public void carregarEstoque(Estoque estoque){
if(estoque != null){
lista.add(estoque);
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
