import java.util.Scanner;

public class Questao03 {


    public static void main(String[] args) {

            /*
Faça um     Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
            */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o Sexo: ");
        String sexo = entrada.nextLine();


        if (sexo.equalsIgnoreCase("F")){
            System.out.println("O sexo é Feminino");

            }
        else if (sexo.equalsIgnoreCase("M")){
            System.out.println("O sexo é Masculino");

            }
        else {
            System.out.println("Sexo Invalido");
        }










    }
}
