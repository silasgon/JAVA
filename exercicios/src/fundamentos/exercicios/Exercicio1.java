package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em F�(Fahrenheit): ");
		double f = entrada.nextDouble();
		double c = (f - 32) * 5 / 9;
		
		System.out.printf("A temperatura em C� (Celsius) �: %.1f�C", c);
		entrada.close();
	}

}
