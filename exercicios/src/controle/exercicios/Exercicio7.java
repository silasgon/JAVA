package controle.exercicios;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		int contador = 0;
		int numero = 0;
		
		Scanner entrada = new Scanner(System.in);


		
		while(numero >= 0){
			
			System.out.print("\nDigite um numero: ");
			numero = entrada.nextInt();
			
			if(numero >= 0) {
				contador += numero;
				System.out.printf("\nVocê inseriu o numero %d, a soma é %d", numero, contador);
			}
			
		}
		
		System.out.println("\nO programa será encerrado");

		entrada.close();
	}
}
