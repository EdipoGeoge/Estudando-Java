import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {




        /*
        Faça um Programa que pergunte em que turno você estuda.
        Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
        Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
         */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual turno você estuda? " +
                " M - Matutino" +
                " V - Vespertino" +
                " N - Noturno");
        String turno = entrada.nextLine();

        if (turno.equalsIgnoreCase ("m")){
            System.out.println("Bom Dia!!!");
        }
        else if (turno.equalsIgnoreCase("v")){
            System.out.println("Boa Tarde!!!");
        }
        else if (turno.equalsIgnoreCase("n")){
            System.out.println("Boa Noite!!!");
        }
        else{
            System.out.println("Valor Inválido!");
        }





    }
}
