import java.util.Scanner;

/**
 * numeros
 */
public class numeros {

    public static void main(String[] args) {
        int num;

        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 5: ");
        num = leitorScanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("O número digitado foi o UM");
                break;
            case 2:
                System.out.println("O número digitado foi o DOIS");
                break;
            case 3:
                System.out.println("O número digitado foi o TRÊS");
                break;
            case 4:
                System.out.println("O número digitado foi o QUATRO");
                break;
            case 5:
                System.out.println("O número digitado foi o CINCO");
                break;  
            default:
                System.out.println("O número digitado é INVÁLIDO");
                break;
        }

    }
}