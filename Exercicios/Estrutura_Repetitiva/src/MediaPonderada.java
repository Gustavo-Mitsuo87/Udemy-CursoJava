
import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {
    /*
    Processa casos de teste para cálculo de média harmônica/ponderada 
    com saída formatada em uma casa decimal.
    Processes test cases for calculating harmonic/weighted average 
    with output formatted to one decimal place.
    */
   public static void main(String[] args){
    Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double a, b, c, media;

        for (int i = 0; i<n; i++) {

            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();

            media = (a*2 + b*3 + c*5) / 10;
            System.out.printf("%.1f%n",media);
        }
    }
}
