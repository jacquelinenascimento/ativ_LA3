import java.util.Scanner;

/**
 * variaveis
 */
public class variaveis {

    public static void main(String[] args) {
        
        int A;
        int B;
        int temp;

        Scanner leitorScanner = new Scanner(System.in);

        System.out.print("Digite a primeira variável: ");
        A = leitorScanner.nextInt();
        System.out.println("A primeira variável é: " + A);

        System.out.print("Digite a segunda variável: ");
        B = leitorScanner.nextInt();
        System.out.println("A segunda variável é: " + B);

        temp = A;
        A = B;
        B = temp;

        System.out.print("A primeira variável passa a ser " + A);
        System.out.print(" e a segunda variável passa a ser " + B);

    }
}