package Lista_de_Exercicios_1;

public class questao12 {
    public static void main(String[] args) {
        System.out.println("Divisões por 2 de múltiplos de 3 até 100");

        for(double i = 1; i <= 100; i++){
            if (i%3 == 0) {
                System.out.printf("Número %.0f", i);
                System.out.println(" --------- Divisão por 2: " + (i/2));
            }
        }
    }
}
