import java.util.Scanner;

public class Dia {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        String dia;
        /*Essa estrura atualmente pode
        ser reduzida;
        switch (x) {
            case 1 -> dia = "domingo";
            case 2 -> dia = "segunda";
            case 3 -> dia = "terca";
            case 4 -> dia = "quarta";
            case 5 -> dia = "quinta";
            case 6 -> dia = "sexta";
            case 7 -> dia = "sabado";
            default -> dia = "valor invalido";
        }
        */
        switch (x) { // inicio do switch
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terca";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default: // caso contrario tem um valor padrao
                dia = "valor invalido";
                break;
        } // fim do switch
        System.out.println("Dia da semana: " + dia);
        sc.close();
    }
}
