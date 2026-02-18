import java.util.Scanner;

public class Enqunto {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int soma = 0;

        while (n != 0) { // basico do while, mas com a condição no começo
            soma += n; // soma recebe o valor atual de soma mais o valor de n
            n = sc.nextInt();
        }

        System.out.println(soma);
        sc.close();
    }}
