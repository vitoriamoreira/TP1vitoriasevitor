
package mercadolivre;

import java.util.ArrayList;
import java.util.Collection;

public class Cliente {
    String nome;
    int CPF;
    int telefone;
    Cliente endereco;
    public Cliente(String n){
        this.nome=n;
        
        
    }
}

      public class lista {
            public static void main(String[] args) {    
            Collection<String> endereco = new ArrayList();
            endereco.add("caxias");
            endereco.add("carapebus");
            endereco.add("rio de janeiro");
            endereco.add("piteiras");
            endereco.add("quissamã");
         
            System.out.println(“Lista de endereco: ”+endereco);
    }
}

  


    



