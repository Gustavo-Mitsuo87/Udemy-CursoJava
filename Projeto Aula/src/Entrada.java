import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in) // Scanner para ler a entrada do usuário
        ) {
            System.out.print("Digite dois números inteiros: ");
            int x, y;
            double soma;
            x = sc.nextInt();
            y = sc.nextInt();
            soma = (double) x / y; // casting para double
            System.out.printf("\nSOMA = %.1f ", soma);

            sc.close(); // Fechando o scanner que é usado para entrada de dados


        }
    }
}

