import java.util.Scanner;

public class Questao06 {


    /*
    Faça um Programa que leia três números e mostre o maior deles.
    */


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o Primeiro Número: ");
        Integer primeiroNumero = entrada.nextInt();
        System.out.println("Digite o Segundo Número: ");
        Integer segundoNumero = entrada.nextInt();
        System.out.println("Digite o Terceiro Número: ");
        Integer terceiroNumero = entrada.nextInt();

        if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero){
            System.out.println("O número maior é: " + primeiroNumero);
        }
        else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero){
            System.out.println("O número maior é: " + segundoNumero);
        }
        else {
            System.out.println(" O número Maior é: " + terceiroNumero);
        }




    }
}
