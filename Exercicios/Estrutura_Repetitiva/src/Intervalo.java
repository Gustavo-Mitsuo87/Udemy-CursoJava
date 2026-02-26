import java.util.Scanner;

public class Intervalo {
    /*
    Classifica uma lista de valores inteiros com base na condição de 
    inclusão no intervalo fechado entre 10 e 20.
    Sort a list of integer values based on the condition of inclusion 
    in the closed interval between 10 and 20.
    */
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i= 0; i<n; i++) {
            int num = sc.nextInt();
            if (num >= 10 && num <= 20){
                in++;
            } else{
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
   }
}
