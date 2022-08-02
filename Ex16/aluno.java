import java.util.Scanner;

/**
 * aluno
 */
public class aluno {

    public static void main(String[] args) {
        String nome;
        float nota1;
        float nota2;
        float nota3;
        float media;

        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        nome = leitorScanner.nextLine();

        System.out.println("Digite a nota 1 do aluno: ");
        nota1 = leitorScanner.nextFloat();

        System.out.println("Digite a nota 2 do aluno: ");
        nota2 = leitorScanner.nextFloat();

        System.out.println("Digite a nota 3 do aluno: ");
        nota3 = leitorScanner.nextFloat();

        media = (nota1 + nota2 + nota3)/3;

        if (media <= 5) {
            System.out.println("O aluno está reprovado.");
        } else {
            if (media >= 7) {
                System.out.println("O aluno está aprovado! ");
            } else {
                System.out.println("O aluno está em recuperação. ");
            }
        }
        
    }
}