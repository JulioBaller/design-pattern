package exemplo2;

public class Teste {
    
    public static void main(String[] args) {
        Exibir exibir = new Exibir() {

            @Override
            public void nome(){
System.out.println("Gerson");
            }

            @Override
            public void sobrenome(){
System.out.println("Risso");
            }
        };

        exibir.nome();
        exibir.sobrenome();
    }
}
