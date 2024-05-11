package exemplo3;


@FunctionalInterface
public interface Exemplo3{
    public String getNome();

    default void exibir(String nome){
        System.out.println(nome);
    }
}