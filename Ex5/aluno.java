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

        System.out.print("Digite o nome do aluno: ");
        nome = leitorScanner.nextLine();
        System.out.print("Digite a primeira nota do aluno: ");
        nota1 = leitorScanner.nextFloat();
        System.out.print("Digite a segunda nota do aluno: ");
        nota2 = leitorScanner.nextFloat();
        System.out.print("Digite a terceira nota do aluno: ");
        nota3 = leitorScanner.nextFloat();

        media = (nota1 + nota2 + nota3)/3;

        System.out.print("A média do aluno: " + media);

    }
}