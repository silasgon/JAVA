package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro n�mero: ");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo n�mero: ");
		String sinal = JOptionPane.showInputDialog("Qual opera��o deseja executar: ");
		
		double soma = 0, subtracao = 0, divisao = 0, multiplicacao = 0, modulo = 0;
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		

		soma = "+".equals(sinal)? numero1 + numero2 : subtracao;
		subtracao = "-".equals(sinal)? numero1 - numero2 : divisao;
		divisao = "/".equals(sinal)? numero1 / numero2 : multiplicacao;
		multiplicacao = "*".equals(sinal)? numero1 * numero2 : modulo;
		modulo = "%".equals(sinal)? numero1 % numero2 : soma;
		
		System.out.printf("A soma �: %s %n", soma);
		System.out.printf("A subtra��o �: %s %n", subtracao);
		System.out.printf("A divis�o �: %s %n", divisao);
		System.out.printf("A multiplica��o �: %s %n", multiplicacao);
		System.out.printf("O m�dulo �: %s %n", modulo);
	
	}

}
