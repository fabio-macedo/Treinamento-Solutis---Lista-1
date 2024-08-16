package Lista_de_Exercicios_1;

import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        //usuário escolhe o valor da soma até o máximo possível para dois dados
        System.out.println("Digite a soma que se quer obter as possibilidades possíveis: (2 - 12)");
        int qtd = new Scanner(System.in).nextInt();
        while (qtd < 2 || qtd > 12) {
            System.out.println("Número inválido tente novamente:");
            qtd = new Scanner(System.in).nextInt();
        }
        
        lancaDados(qtd);
    }

    private static void lancaDados(int qtd) {
        int aux = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i+j == qtd) {
                    aux++;
                }
            }
        }
        System.out.println("Total de possibilidades para a soma ser "+ qtd + " --> "+aux);
    }
}
