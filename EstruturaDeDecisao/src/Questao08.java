import java.util.Scanner;

public class Questao08 {

    public static void main(String[] args) {


        /*
        Faça um programa que pergunte o preço de três produtos e
        informe qual produto você deve comprar,
        sabendo que a decisão é sempre pelo mais barato
         */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o preço do Produto 1: R$ ");
        Double produto1 = entrada.nextDouble();
        System.out.println("Digite o preço do Produto 2: R$ ");
        Double produto2 = entrada.nextDouble();
        System.out.println("Digite o preço do Produto 3: R$ ");
        Double produto3 = entrada.nextDouble();

        Boolean barato1 = produto1 <= produto2 && produto1 <= produto3;
        Boolean barato2 = produto2 <= produto1 && produto2 <= produto3;


        if (barato1) {
            System.out.println("Produto mais barato é: R$ " + produto1);
        } else if (barato2) {
                System.out.println("produto mais barato é: R$ " + produto2);
            }
        else {
            System.out.println("Produto mais barato é: R$ " + produto3);
        }


    }
}
