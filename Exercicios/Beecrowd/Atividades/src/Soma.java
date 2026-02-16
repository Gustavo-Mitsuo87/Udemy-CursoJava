import java.util.Scanner;
public class Soma {

    public static void main(String[] args) {
        @SuppressWarnings("ConvertToTryWithResources") // Isso faz o VS code para de avisar sobre o Scanner
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();  
        int soma = a + b;
        System.out.printf("SOMA = %d\n", soma); // Dessa forma o BeeCrowd aceita a resposta
        sc.close();

    }
}
