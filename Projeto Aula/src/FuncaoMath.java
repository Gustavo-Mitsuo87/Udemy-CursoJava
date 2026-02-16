public class FuncaoMath {
    public static void main(String[] args) {
        
        // Usando Math.sqrt() para calcular a raiz quadrada
        double num = 9.0;
        double raizQuadrada = Math.sqrt(num);
        System.out.println("A raiz quadrada de " + num + " é: " + raizQuadrada);

        // Usando Math.pow() para calcular a potência
        double base = 2.0;
        double expoente = 3.0;
        double potencia = Math.pow(base, expoente);
        System.out.println(base + " elevado a " + expoente + " é: " + potencia);

        // Usando Math.abs() para obter o valor absoluto
        double valorNegativo = -5.5;
        double valorAbsoluto = Math.abs(valorNegativo);
        System.out.println("O valor absoluto de " + valorNegativo + " é: " + valorAbsoluto);

        // Usando Math.max() e Math.min()
        double num1 = 7.5;
        double num2 = 3.2;
        double num3 = 10.8;
        double maximo = Math.max(Math.max(num1, num2), num3);
        double minimo = Math.min(Math.min(num1, num2), num3);
        System.out.println("O máximo entre " + num1 + ", " + num2 + " e " + num3 + " é: " + maximo);
        System.out.println("O mínimo entre " + num1 + ", " + num2 + " e " + num3 + " é: " + minimo);
    }
}
