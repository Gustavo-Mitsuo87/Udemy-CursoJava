import java.util.Locale;
import java.util.Scanner;

public class Figuras {
    /*
    Com os valores digitados, se faz o cálculo da área das figuras geométricas.
    With the entered values, the area of the geometric figures is calculated.
    */

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        areaTriangulo = (a * c) / 2.0;
        areaCirculo = 3.14159 * Math.pow(c, 2);
        areaTrapezio = ((a + b) / 2.0) * c;
        areaQuadrado = Math.pow(b, 2);
        areaRetangulo = a * b;

        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
        sc.close();

    }
}
