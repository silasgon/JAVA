package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com a Base do Tri?ngulo: ");
		double base = entrada.nextDouble();
		
		System.out.print("Entre com a Altura do Tri?ngulo: ");
		double altura = entrada.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.printf("(%.2f * %.2f)/2 = %.2f ", base, altura, area);
		
		entrada.close();
	}

}
