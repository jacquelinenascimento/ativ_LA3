import java.util.Scanner;

/**
 * carango
 */
public class carango {

    public static void main(String[] args) {
        char op = 'S';
        int ano;
        int carrosantigos = 0;
        int carrosnovos = 0;
        int total = 0;
        double valor_orig;
        double valor_desc;

        Scanner leitorScanner = new Scanner(System.in);

        while (op == 'S') {
            System.out.println("Digite o valor do carro: ");
            valor_orig = leitorScanner.nextFloat();

            System.out.println("Digite o ano do carro: ");
            ano = leitorScanner.nextInt();

            if (ano <= 2000) {
                valor_desc = valor_orig - (valor_orig * 0.12);
                carrosantigos = carrosantigos + 1;
            } else {
                valor_desc = valor_orig - (valor_orig * 0.07);
                carrosnovos = carrosnovos + 1;
            }
            total = carrosantigos + carrosnovos;

            System.out.println("O valor com desconto do carro é R$" + valor_desc);
            System.out.print("Digite S - para continuar ou N - para encerrar: ");
            op = leitorScanner.next().charAt(0);
        }

        System.out.println("O total de carros foi de " + total);
        System.out.println("O total de carros com ano até 2000 foi de " + carrosantigos);

        
    }
}