
import java.util.Locale;
import java.util.Scanner;

public class Imposto {
    /*
    Esse código faz o cálculo de imposto progressivo a partir do salário digitado.
    This code calculates progressive tax based on the entered salary.
    */

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        /*
        O imposto de renda é calculado com base na seguinte tabela:
        - Até R$ 2000.00: Isento       
        - De R$ 2000.01 até R$ 3000.00: 8% sobre o valor acima de R$ 2000.00
        - De R$ 3000.01 até R$ 4500.00: 18% sobre o valor acima de R$ 3000.00
        - Acima de R$ 4500.00: 28% sobre o valor acima de R$ 4500.00
        Esse imposto é progressivo, ou seja, cada faixa de renda é tributada separadamente.
        */
        double imposto;
        if (salario <= 2000.0) {
            imposto = 0.0;
        } else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        } else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", imposto);
        }
        sc.close();
    }
}
