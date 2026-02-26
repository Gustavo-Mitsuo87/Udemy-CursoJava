import java.util.Scanner;

public class Divisor {
    /*
    Calcula e exibe todos os números entre 1 e N que possuem resto zero na divisão por N.
    Calculate and display all the numbers between 1 and N that have a remainder of zero when divided by N.
    */
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 1; i<=num; i++) {
            double div = num % i;
            if (div == 0){
                System.out.println(i);  
            }
        }
   }
}
