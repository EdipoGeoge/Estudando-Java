import java.util.Scanner;

public class Questao07 {

    public static void main(String[] args) {

        /*
        Faça um Programa que leia três números e mostre o maior e o menor deles.
         */
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite o Primeiro Número: ");
        Integer primeiroNumero = entrada.nextInt();
        System.out.println("Digite o Segundo Número: ");
        Integer segundoNumero = entrada.nextInt();
        System.out.println("Digite o Terceiro Número: ");
        Integer terceiroNumero = entrada.nextInt();

        Integer maior  = 0;
        Integer menor = 0;

        Boolean numeroMaior1  = primeiroNumero >= segundoNumero && primeiroNumero >= terceiroNumero;
        Boolean numeroMaior2 = segundoNumero >= primeiroNumero && segundoNumero >= terceiroNumero;

        Boolean numeroMenor1 = primeiroNumero <= segundoNumero && primeiroNumero <= terceiroNumero;
        Boolean numeroMenor2 = segundoNumero <= primeiroNumero && segundoNumero <= terceiroNumero;


        if (numeroMaior1) {
            maior = primeiroNumero;

        }else if (numeroMaior2) {
            maior = segundoNumero;

        }else {
            maior = terceiroNumero;
        }
        System.out.println("O Maior número é: " + maior);



        if (numeroMenor1) {
            menor = primeiroNumero;

        }else if (numeroMenor2) {
            menor = segundoNumero;

        }else {
            menor = terceiroNumero;
        }
        System.out.println("O Menor número é: " + menor);





    }
}
