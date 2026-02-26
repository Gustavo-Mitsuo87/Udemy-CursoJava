import java.util.Scanner;

public class Potencia {
    /*
    Gera uma sequência de 'n' linhas, exibindo o valor atual, seu quadrado e seu cubo.
    Generate a sequence of 'n' lines, displaying the current value, its square, and its cube.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i<=num; i++) {
            int potencia = i;
            int potencia2 = i*i;
            int potencia3 = i*i*i;
            System.out.printf("%d %d %d%n",potencia,potencia2,potencia3);
        }
    }
}
