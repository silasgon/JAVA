package controle.exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		
		int contDivisores = 0;
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um numero para verificar se pe primo: ");
		int numero = entrada.nextInt();
		
		
		
		for (int i = 2; i < numero; i++) {
		
			if(numero % i == 0) contDivisores++;
			
		}
		
		switch (contDivisores ) {
		case 0: 
			System.out.printf("\nO numero %d � primo", numero);
			break;
		default:
			System.out.printf("\nO numero %d n�o � primo", numero);
		}

		entrada.close();
		
	}

}
