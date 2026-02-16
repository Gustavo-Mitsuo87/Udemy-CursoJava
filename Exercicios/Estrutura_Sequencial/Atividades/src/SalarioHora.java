import java.util.Locale;
import java.util.Scanner;

public class SalarioHora {
    /*
    Calcula o valor total do salario do tempo trabalhado.
    Calculate the total value of the salary for the time worked.
    */

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        int numFun, horas; // numFum = numero do funcionário - employe number
        numFun = sc.nextInt();
        horas = sc.nextInt();
        double salarioHora = sc.nextDouble();

        double salario = horas * salarioHora;
        System.out.println("NUMBER = " + numFun);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close(); 
    }
}
