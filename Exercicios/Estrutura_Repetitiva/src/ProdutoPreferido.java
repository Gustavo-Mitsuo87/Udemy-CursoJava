import java.util.Scanner;

public class ProdutoPreferido {
    /*
    Implementa uma estrutura de repetição para validar 
    entradas e incrementar contadores específicos para álcool, gasolina e diesel. 
    Implement a loop structure to validate inputs and increment specific counters 
    for alcohol, gasoline, and diesel.   
    */
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

    }
}
