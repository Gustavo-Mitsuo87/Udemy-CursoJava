import java.util.Scanner;

public class PositivoNegativo {
    /*
    Com o numero digitado ele diz 
    se é negativo ou não negativo.
    With the number entered, it says 
    whether it is negative or non-negative. 
    */
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a >= 0) 
            System.out.println("Não negativo");
        else
            System.out.println("Negativo");
        
        sc.close();
    }
}
