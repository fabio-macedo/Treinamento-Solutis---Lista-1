package Lista_de_Exercicios_1;

import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        System.out.println("Digite um número:");
        int number = new Scanner(System.in).nextInt();
        parImpar(number);
    }

    public static void parImpar(int number){
        if (number%2 == 0) {
        System.out.printf("%d é um número par!", number);
        }else{
            System.out.printf("%d é um número ímpar!", number);
        }
    }
}
