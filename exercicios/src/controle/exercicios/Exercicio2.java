package controle.exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um ano (YYYY): ");
		int ano = entrada.nextInt();
		
		if(ano % 4 == 0) {
			System.out.printf("O ano %d � bissexto", ano);
		}else {
			System.out.printf("O ano %d n�o � bissexto", ano);
		}
		

		entrada.close();
	}

}
