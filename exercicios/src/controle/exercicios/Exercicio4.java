package controle.exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {

		int contDivisores = 0;
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um numero para verificar se pe primo: ");
		int numero = entrada.nextInt();
		
		
		
		for (int i = 2; i < numero; i++) {
		
			if(numero % i == 0) contDivisores++;
			
		}
		
		
		if(contDivisores == 0){ 
			System.out.printf("\nO numero %d é primo", numero);
		}else {
			System.out.printf("\nO numero %d não é primo", numero);
		}
		

		entrada.close();
	}

}
