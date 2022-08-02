import java.util.Scanner;

/**
 * numbers
 */
public class numbers {

    public static void main(String[] args) {
        int i = 0;
        int qtd = 0;
        int n;

        Scanner leitorScanner = new Scanner(System.in);

        for (; i < 80; i++) {
            System.out.println("Digite um número: ");
            n = leitorScanner.nextInt();
            if (n >= 10 && n <=150) {
                qtd = qtd + 1;
            }
        }
        System.out.println("O total de números entre 10 e 150 é: " + qtd);
    }
}