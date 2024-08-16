package Lista_de_Exercicios_1;

import java.util.Random;

public class questao14 {
    public static void main(String[] args) {
        Random random = new Random();
        int count =0, limit = 50, sum = 0, number =0;

        while (count < limit) {
            number = random.nextInt(100);
            System.out.println("Número: " + number);
            sum += number;
            count ++;
        }    
        calcularMedia(sum, limit);
    }

    private static void calcularMedia(int sum, int limit) {
        double soma = (double) sum;
        System.out.printf("Média: %.2f", (soma/limit));
    }
}
