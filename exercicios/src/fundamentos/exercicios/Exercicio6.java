package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com o valor de a: ");
		double a = entrada.nextDouble();
		
		System.out.print("Entre com o valor de b: ");
		double b = entrada.nextDouble();
		
		System.out.print("Entre com o valor de c: ");
		double c = entrada.nextDouble();
		
		System.out.println("\nEssa ? a equa??o do segundo grau");
		System.out.printf("   %.1fx? + %.1fx + %.1f = 0  ", a, b, c);
		System.out.println("\n-------------------------------------");
		System.out.println("\nPrimeiro vou calcular o delta ");
		System.out.println("Delta = b? - 4 * a * c");
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		System.out.println("Delta = " + delta);
		
		double superior1 = - b + Math.sqrt(delta);
		double superior2 = - b - Math.sqrt(delta);
		double inferior = 2 * a;
		
		double x1 = superior1 / inferior;
		double x2 = superior2 / inferior;
		
		System.out.println("Vamos calcular a equa??o usando a formula de Bhaskara");
		System.out.println("O valor do X1 ? " + x1);
		System.out.println("O valor do X2 ? " + x2);
		
		entrada.close();
	}

}
