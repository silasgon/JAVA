package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite umm valor :");
		double valor = entrada.nextDouble();
		
		System.out.println("O valor ao Quadrado � :" + Math.pow(valor, 2));
		System.out.println("O valor ao cubo � :" + Math.pow(valor, 3));
		
		entrada.close();
	}
}
