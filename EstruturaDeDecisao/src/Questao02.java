import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {

        /*
        Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
         */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um Valor");
        Double valor = entrada.nextDouble();

        if (valor >= 0){
            System.out.println("O numero é POSITIVO");
        } else {
            System.out.println("O numero é NEGATIVO");
        }
    }

}
