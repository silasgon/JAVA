package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o peso: ");
		double peso = entrada.nextDouble();
		
		System.out.print("Digite a altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.printf("O seu IMC ?: %.2f", imc);
		
		
		entrada.close();
	}

}
