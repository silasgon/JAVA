package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");
		String sinal = JOptionPane.showInputDialog("Qual operação deseja executar: ");
		
		double soma = 0, subtracao = 0, divisao = 0, multiplicacao = 0, modulo = 0;
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		

		soma = "+".equals(sinal)? numero1 + numero2 : subtracao;
		subtracao = "-".equals(sinal)? numero1 - numero2 : divisao;
		divisao = "/".equals(sinal)? numero1 / numero2 : multiplicacao;
		multiplicacao = "*".equals(sinal)? numero1 * numero2 : modulo;
		modulo = "%".equals(sinal)? numero1 % numero2 : soma;
		
		System.out.printf("A soma é: %s %n", soma);
		System.out.printf("A subtração é: %s %n", subtracao);
		System.out.printf("A divisão é: %s %n", divisao);
		System.out.printf("A multiplicação é: %s %n", multiplicacao);
		System.out.printf("O módulo é: %s %n", modulo);
	
	}

}
