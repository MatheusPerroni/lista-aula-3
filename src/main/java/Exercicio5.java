import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(10) + 1;

        int i = 1;
        while (i < 2) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Insira um número entre 1 e 10:");
            int num = entrada.nextInt();
            if (num == x) {
                System.out.println("Você acertou!!!");
                i = 2;

            } else {
                System.out.println("Voce errou!!!");
            }

        }

    }
}
