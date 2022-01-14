import java.util.Scanner;

public class Questao05 {


    /*
    Faça um programa para a leitura de duas notas parciais de um aluno.
    O programa deve calcular a média alcançada por aluno e apresentar:
        A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
        A mensagem "Reprovado", se a média for menor do que sete;
        A mensagem "Aprovado com Distinção", se a média for igual a dez.
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota 1:  ");
        Double nota1 = entrada.nextDouble();
        System.out.println("Digite a nota 2:  ");
        Double nota2 = entrada.nextDouble();

        Double media = (nota1 + nota2) / 2;

        if (media >= 7.0 && media < 10.0){
            System.out.println("APROVADO");
        }
        else if (media < 7.0){
            System.out.println("REPROVADO");
        }
        else if (media == 10.0){
            System.out.println("APROVADO COM DISTINÇÃO");

        }
    }
}
