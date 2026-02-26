import java.util.Scanner;

public class Fatorial {
    /*
    Este programa calcula o fatorial de um número inteiro positivo N.
    This program calculates the factorial of a positive integer N.
    */
   public static void main(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fat = 1;
        
        for (int i = 1; i <= n; i++) {
            fat = fat * i;
        }
        System.out.println(fat);
   }
}
