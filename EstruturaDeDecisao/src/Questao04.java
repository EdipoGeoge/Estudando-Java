import java.util.Scanner;

public class Questao04 {


    public static void main(String[] args) {

        /*
        Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
        */


        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = entrada.nextLine();


        if (letra.equalsIgnoreCase("a")) {
            System.out.println("É uma Vogal!!! ");
        }
        else if (letra.equalsIgnoreCase("e")) {
            System.out.println("É uma Vogal!!! ");
        }
        else if (letra.equalsIgnoreCase("i")) {
            System.out.println("É uma Vogal!!! ");
        }
        else if (letra.equalsIgnoreCase("o")) {
            System.out.println("É uma Vogal!!! ");
        }
        else if (letra.equalsIgnoreCase("u")) {
            System.out.println("É uma Vogal!!! ");
        } else {
            System.out.println("É uma Consoante!!! ");
        }
    }

}

