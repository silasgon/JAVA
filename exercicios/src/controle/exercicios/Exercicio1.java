package controle.exercicios;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("O numero deve ser par e estar entre 0 e 10");
		System.out.print("\nDigite um numero: ");
		
		int numero = entrada.nextInt();
		
		boolean condicao1 = (numero > 0 && numero <= 10);
		boolean condicao2 = (numero % 2 == 0 );
		
		if (condicao1 ){
			if(condicao2) {
				System.out.printf("\nO numero %d atende as condi??es.", numero);
			}
			System.out.println("\nUma condi??o n?o atendida!");
		}
		if (condicao1 == false) {
			System.out.println("\nUma condi??o n?o atendida!");
		}
		System.out.println("Fim!");

		entrada.close();
	}

}
