import java.util.Scanner;

/**
 * temperatura
 */
public class temperatura {

    public static void main(String[] args) {
        
        float C;
        float F;

        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        C = leitorScanner.nextFloat();

        F = (9 * C + 160) / 5;

        System.out.println("A temperatura em graus Fahrenheit é: " + F);
    }
}