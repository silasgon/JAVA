package controle.exercicios;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		
		int maior = 0;
		int quantidade = 10;
		
		Scanner entrada = new Scanner(System.in);

	
		for (int i = 0; i < quantidade; i++) {
			System.out.print("Digite um n�mero: ");
			int numero = entrada.nextInt();
			
			if (numero > maior) maior = numero;
		}
		
		System.out.printf("\nO maior numero da sequencia � %d", maior);
		

		entrada.close();
	}

}
