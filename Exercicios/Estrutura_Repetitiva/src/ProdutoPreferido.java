import java.util.Scanner;

public class ProdutoPreferido {
    /*
    Uso do while para a contagem dos produtos (alcool, gasolina e diesel).
    Use of while for counting the products (alcohol, gasoline, and diesel).
    */
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int combustivel = sc.nextInt();
        int alcool = 0, gasolina = 0, diesel = 0;

        while (combustivel != 4) {
            if (combustivel >= 1 && combustivel <= 3) {
                if (combustivel == 1) {
                    alcool += 1;
                } else if (combustivel == 2) {
                    gasolina += 1;
                } else {
                    diesel += 1;
                }
            } else {
                System.out.println("Código inválido");
            }
            combustivel = sc.nextInt();
        }
        
        System.out.println("MUITO OBRIGADO!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        sc.close();
    }
}
