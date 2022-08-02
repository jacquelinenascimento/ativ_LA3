import java.util.Scanner;

/**
 * vendas
 */
public class vendas {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String nome;
        float sal_fixo;
        float tot_vendas;
        float comissao = 0.15f;
        float salario;

        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor: ");
        nome = leitorScanner.nextLine();

        System.out.println("Digite o salário fixo do vendedor: ");
        sal_fixo = leitorScanner.nextFloat();

        System.out.println("Digite o total de vendas do vendedor: ");
        tot_vendas = leitorScanner.nextFloat();

        salario = sal_fixo + (tot_vendas * comissao);

        System.out.println("O salario do mês atual do vendedor " + nome + " é de R$" + salario);



    }
}