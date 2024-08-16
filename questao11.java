package Lista_de_Exercicios_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class questao11 {
 
    public static void main(String[] args) {
        System.out.println("Digite o código do produto:");
        String cod = new Scanner(System.in).nextLine();
        
        buscaProduto(cod);
    }

    private static void buscaProduto(String cod) {
        if (cod.equals("001")) {
            System.out.println("Parafuso");
        }else if (cod.equals("002")) {
            System.out.println("Porca");
        }else if (cod.equals("003")) {
            System.out.println("Prego");
        }else{
            System.out.println("Diversos");
        }
      
    }
}
