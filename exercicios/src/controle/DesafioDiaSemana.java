package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana:");
		String dia = entrada.next();
		
		if(dia.equalsIgnoreCase("domingo")) {
			System.out.println("1");
		}else if (dia.equalsIgnoreCase("Segunda")) {
			System.out.println(2);			
		}else if ("ter�a".equalsIgnoreCase(dia)
				||"terca".equalsIgnoreCase(dia)) {
			System.out.println(3);			
		}else if ("quarta".equalsIgnoreCase(dia)) {
			System.out.println(4);			
		}else if ("quinta".equalsIgnoreCase(dia)) {
			System.out.println(5);			
		}else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println(6);			
		}else if ("sabado".equalsIgnoreCase(dia)
				||"s�bado".equalsIgnoreCase(dia)) {
			System.out.println(7);			
		}else {
			System.out.println("Digite um dia v�lido");
		}
		
		entrada.close();
	}

}
