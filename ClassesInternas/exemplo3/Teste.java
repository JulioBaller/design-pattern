package exemplo3;
public class Teste {
    public static void main(String[] args) {
        
        Exemplo3 exemplo3 = new Exemplo3() {
            @Override
            public String getNome(){
                
              return "nome";
            }
        };
        
        exemplo3.exibir(exemplo3.getNome());
    }
}
