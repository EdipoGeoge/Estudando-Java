import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {

        /*
        Faça um Programa que peça dois números e imprima o maior deles.
         */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        Integer numero1 = entrada.nextInt();

        System.out.println("Digite outro numero: ");
        Integer numero2 = entrada.nextInt();



        if (numero1 > numero2) {
            System.out.println("O numero Maior é " + numero1);
        } else {
            System.out.println("O numero maior é " + numero2);
        }




    }
}
