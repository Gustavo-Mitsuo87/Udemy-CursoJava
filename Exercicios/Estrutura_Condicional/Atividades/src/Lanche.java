import java.util.Locale;
import java.util.Scanner;

public class Lanche {
	/*
	Uso do encadeamento de if e else. 
	Com o preço definido, é só multiplicar com o
	valor da entrada da variável qtd. 
	Use of chaining if and else.
	With the price set, just multiply by the
	value of the input of the variable qtd.	
	*/
    @SuppressWarnings({"ConvertToTryWithResources"})
    public static void main(String[] args){
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	int codigo, qtd;
	codigo = sc.nextInt();
	qtd = sc.nextInt();
	double total = 0;
	
	if (codigo == 1) { /*o vs code quer switch case, mas o enunciado não diz pra usar 
		vs code wants a switch case, but the prompt doesn't say to use one.*/
		total = qtd * 4;
	} else if (codigo == 2){
		total = qtd * 4.5;
	} else if (codigo == 3){
		total = qtd * 5;
    } else if (codigo == 4){
		total = qtd * 2;
    } else if (codigo == 5){
		total = qtd * 1.5;
    }
	System.out.printf("Total: R$%.2f%n", total);

	sc.close();
    }
}