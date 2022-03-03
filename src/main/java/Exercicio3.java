import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Irforme a nota da NPA:");
        int NPA = entrada.nextInt();
        if(NPA >= 60){
            System.out.println("Você foi aprovado!");
        } else{
            System.out.println("Informe a nota da NP3:");
            int NP3 = entrada.nextInt();
            int NFA = (NPA+NP3)/2;
            if(NFA>=50){
                System.out.println("Você foi aprovado!");
            } else{
                System.out.println("Você reprovou!");
            }
        }

    }

}
