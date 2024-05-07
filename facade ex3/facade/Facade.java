package facade;

import composite.*;

public class Facade {
    
    public static void fachada(){

Composite cestaCM=new Composite("Café da manhã");
      
      Component produto1=new Leaf(12.56, "café");
      Component produto2=new Leaf(10.26, "leite");
      Component produto3=new Leaf(6.12, "pão");
      Component produto4=new Leaf(8.23, "manteiga");
      
      cestaCM.adicionar(produto1);
      cestaCM.adicionar(produto2);
      cestaCM.adicionar(produto3);
      cestaCM.adicionar(produto4);
      
      Composite cestaA=new Composite("Aniversário");
      
      Component produto5=new Leaf(5.56, "brigadeiro");
      Component produto6=new Leaf(24.26, "bolo");
      Component produto7=new Leaf(10.12, "refrigerante");
      
      cestaA.adicionar(produto5);
      cestaA.adicionar(produto6);
      cestaA.adicionar(produto7);

      Composite cestaHP=new Composite("HappyHour");
      
      Component produto8=new Leaf(6.56, "chopp");
      Component produto9=new Leaf(16.26, "petiscos");
      Component produto10=new Leaf(9.12, "drinks");
      
      cestaHP.adicionar(produto8);
      cestaHP.adicionar(produto9);
      cestaHP.adicionar(produto10);
      
      System.out.println(cestaCM);
      System.out.println("Total: "+cestaCM.getPreco());
      System.out.println();
      System.out.println(cestaA);
      System.out.println("Total: "+cestaA.getPreco());
      System.out.println();
      System.out.println(cestaHP);
      System.out.println("Total: "+cestaHP.getPreco());
      System.out.println();
      


    }
}
