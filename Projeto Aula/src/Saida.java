import java.util.Locale;


public class Saida { // class serve para agrupar o código em um arquivo Java 
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        byte age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products:\n%s, which price is $ %.2f\n%s, which price is $ %.2f%n%n", product1, price1, product2, price2);
        System.out.printf("Record: %d years old, %d code and gender: %c%n%n", age, code, gender);
        System.out.printf("Measure with eight decimal places: %.8f%nRouded (three decimal places): %.3f", measure, measure);
        Locale.setDefault(Locale.US); // Define o local para US, que usa ponto como separador decimal
        System.out.printf("%nUS decimal point: %.3f%n%n", measure); // usei %n duas vezes para pular uma linha
    }
}
