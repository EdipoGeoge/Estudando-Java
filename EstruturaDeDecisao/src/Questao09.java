import java.util.Scanner;

public class Questao09 {

        public static void main(String[] args) {

                /*
                Faça um Programa que leia três números e mostre-os em ordem decrescente.
                 */

                Scanner entrada = new Scanner(System.in);

                System.out.println("Digite o Primeiro Numero: ");
                Integer primeiroNumero = entrada.nextInt ();
                System.out.println("Digite o Segundo Numero: ");
                Integer segundoNumero = entrada.nextInt();
                System.out.println("Digite o Terceiro Numero: ");
                Integer terceiroNumero = entrada.nextInt();


                Integer auxiliar = 0;


                if (primeiroNumero > segundoNumero){
                        auxiliar = primeiroNumero;
                        primeiroNumero = segundoNumero;
                        segundoNumero = auxiliar;
                }

                if (segundoNumero > terceiroNumero){
                        auxiliar = segundoNumero;
                        segundoNumero = terceiroNumero;
                        terceiroNumero = auxiliar;
                }

                if (primeiroNumero > segundoNumero){
                        auxiliar = primeiroNumero;
                        primeiroNumero = segundoNumero;
                        segundoNumero = auxiliar;
                }

                System.out.println(primeiroNumero + " < " + segundoNumero + " < " + terceiroNumero);




                }




}

