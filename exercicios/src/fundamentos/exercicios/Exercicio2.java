package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em �C (Celsius): ");
		double c = entrada.nextDouble();
		double f = (c * 9/5) + 32;
		
		System.out.printf("A temperatura em F� (Fahrenheit) �: %.1f�F", f);		
		entrada.close();
	}

}
