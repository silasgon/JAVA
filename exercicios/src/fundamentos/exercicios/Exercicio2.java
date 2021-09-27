package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em ºC (Celsius): ");
		double c = entrada.nextDouble();
		double f = (c * 9/5) + 32;
		
		System.out.printf("A temperatura em Fº (Fahrenheit) é: %.1fºF", f);		
		entrada.close();
	}

}
