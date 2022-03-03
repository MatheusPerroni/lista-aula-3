import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira quantos alunos foram matriculados na disciplina C125/C206:");
        int alunos = entrada.nextInt();

        switch (alunos) {
            case 10:
                System.out.println("A sala será a I-15.");
                break;
            case 20:
                System.out.println("A sala será a I-15.");
                break;
            case 30:
                System.out.println("A sala será a I-22.");
                break;
            default:
                System.out.println("O número de alunos pode ser apenas 10,20 ou 30!!!");
        }

    }
}
