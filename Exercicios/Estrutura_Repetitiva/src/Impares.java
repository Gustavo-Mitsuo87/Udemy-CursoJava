import java.util.Scanner;
public class Impares {
    /*
     Percorre a sequência de 0 até N e exibe apenas os valores que possuem 
     resto de divisão por 2 diferente de zero.
     Iterate thru the sequence from 0 to N and display only the values that 
     have a remainder of division by 2 different from zero.
    */
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int num = sc.nextInt();

        for(int i = 0; i <= num; i++) {
            int div = i % 2 ;
            if (div != 0){
                System.out.println(i);
            }
        }
    }
}
