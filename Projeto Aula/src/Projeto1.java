import java.util.Locale;

public class Projeto1 {
    public static void main(String[] args) {
        double a = 5.02345;

        System.out.println(a);  // ln faz uma quebra de linha
        System.out.print(a);   // print não faz quebra de linha
        System.out.printf("\n%.2f", a); // printf formata a saída, nesse caso para 2 casas decimais
        // %n ao invés de \n também funciona para quebra de linha na formatação
        Locale.setDefault(Locale.US); // Define o local para US, que usa ponto como separador decimal
        System.out.printf("\n%.4f", a); // Formata para 4 casas decimais

        System.out.println("RESULTADO = " + a + " METROS"); // concatenação de strings
        System.out.printf("\nRESULTADO = %.2f METROS", a); // formatação com printf
    }
}
