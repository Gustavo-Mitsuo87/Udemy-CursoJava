import java.util.Locale;
import java.util.Scanner;

public class ValorTotal {
    /*
    Calcula o valor total entre duas compras.
    Calculation of the total value between two purchases.
    */
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        @SuppressWarnings("unused") /*Esse aviso é para suprimir o aviso de variável não utilizada. */
                int cod1, cod2;     /*This warning is to suppress the unused variable warning. */
        
        int qtd1, qtd2;
        double valorUnit1, valorUnit2, valorTotal;
        
        cod1 = sc.nextInt();
        qtd1 = sc.nextInt();
        valorUnit1 = sc.nextDouble();

        cod2 = sc.nextInt();
        qtd2 = sc.nextInt();
        valorUnit2 = sc.nextDouble();
        valorTotal = qtd1 * valorUnit1 + qtd2 * valorUnit2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
        sc.close();
    }

}
