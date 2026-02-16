import java.util.Scanner;

public class Multiplo {
    /*
    Vai verificar se os dois números interos são multiplos.
    It will check if the two integers are multiples.
    */
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0) { /*  Verifica se 'a' é múltiplo de 'b' ou 'b' é múltiplo de 'a'. 
                    Checks if 'a' is a multiple of 'b' or if 'b' is a multiple of 'a'. */
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }   
        sc.close();
    }
}
