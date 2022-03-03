import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        int numero1,numero2,numero3,numeroTotal;
        float numeroMedia;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número de monstros mortos na priemira partida:");
        numero1 = entrada.nextInt();

        System.out.println("Digite o número de monstros mortos na segunda partida:");
        numero2 = entrada.nextInt();

        System.out.println("Digite o número de monstros mortos na terceira partida:");
        numero3 = entrada.nextInt();

        numeroTotal = numero1+numero2+numero3;
        numeroMedia = numeroTotal/3;

        System.out.println("Total de montros mortos:"+numeroTotal);
        System.out.println("Média de montros mortos:"+numeroMedia);
    }
}
