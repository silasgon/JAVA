package controle.exercicios;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a palavra: ");
		String palavra = entrada.nextLine();
		
		char letra[] = palavra.toCharArray();
		
		for (int i = 0; i < palavra.length(); i++) {
			System.out.println(letra[i]);			
			
		}

		

		entrada.close();
	}

}
