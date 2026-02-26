import java.util.Locale;
import java.util.Scanner;

public class Divisao {
    /*
    Executa divisões entre dois inteiros e exibe o resultado com uma casa decimal, 
    validando se o denominador é diferente de zero.
    Performs divisions between two integers and displays the result with one decimal place, 
    validating that the denominator is different from zero.
    */

    public static void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int a, b;

        for(int i = 0; i<num; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (b == 0){
                System.out.println("Divisão Impossivel");
            } else {
                double div = (double) a/b;
                System.out.printf("%.1f%n",div);
            }
        }
    }
}
