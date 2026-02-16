
import java.util.Scanner;

public class EntradaLine {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in) // Scanner para ler a entrada do usuário
        ) {
            int x;
            String s1, s2, s3;
            x = sc.nextInt(); // Lendo um número inteiro
            sc.nextLine(); // Consumindo a quebra de linha pendente após nextInt()
            s1 = sc.nextLine();
            s2 = sc.nextLine();
            s3 = sc.nextLine();
            System.out.println("DADOS DIGITADOS:");
            System.out.println(x);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            sc.close();// Fechando o scanner que é usado para entrada de dados
        }
    }
}
