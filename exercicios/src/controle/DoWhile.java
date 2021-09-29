package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		//if(...)sentença: ou {}
		//while(...) sentença; ou {}
		//for(..;..;..) sentença; ou {}
		
		//do {} while(...);
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";

		do {
			System.out.println("Você precisa falar\n"
					+ " as palavras mágicas...");
			System.out.println("Quer sair? ");
			texto = entrada.nextLine();
			
		}while(!texto.equalsIgnoreCase("por favor"));

		entrada.close();

	}

}
