import java.util.Scanner;

public class ParImpar {
    /*
    Aqui o foco é no uso do % com o resto de uma divisão, 
    logo se é zero é par se não impar
    Here the focus is on using the % symbol with the remainder of a division,
    therefore, if it's zero it's even, otherwise it's odd.
    */
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt(); 

        if (numero % 2 == 0) { /*Aqui ele pega o resto da divisão por 2 com essa "%" 
                Here it takes the remainder of the division by 2 with this "%" */ 
            System.out.println("PAR"); 
        } 
        else {
            System.out.println("IMPAR");
        }
        sc.close();
    }
}
