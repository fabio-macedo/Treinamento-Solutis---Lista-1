package Lista_de_Exercicios_1;

import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aux, a, b;

        System.out.println("Digite um valor para 'A':");
        a = sc.nextInt();
        System.out.println("Digite um valor para 'B':");
        b = sc.nextInt();
        aux = a;
        a = b;
        b = aux;
        System.out.printf("Valor de A: %d\nValor de B: %d", a, b);
    }
}
