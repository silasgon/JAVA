package controle.exercicios;

import java.util.Scanner;
//import java.util.Random;

public class Exercicio6 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Random aleatorio = new Random();

		int segredo = 1 + (int) (Math.random() * 100); //aleatorio.nextInt(100) +1;
		int numero = 0;
		int tentativas = 10;

		System.out.print("Jogo da adivinha��o voc� tem 10 chances!\n"
				+ "Qual o n�mero X?\n");
		
		
		while( tentativas != 0) {
			tentativas --;
			
			System.out.print("\nDigite um numero entre 0 e 100: ");
			numero = entrada.nextInt();
			if(numero != segredo) {
				if(numero > segredo) {
					System.out.printf("\nO n�mero %d � > maior que X ", numero);
					System.out.printf("Voc� ainda tem %d tentativas!", tentativas);
				}else {
					System.out.printf("\nO n�mero %d � < menor que X ", numero);
					System.out.printf("Voc� ainda tem %d tentativas!", tentativas);
				}
				
			}else {
				System.out.printf("Voce acertou, o valor de X � : %d", numero);
				break;
			}
			
			
		}
		
		entrada.close();
	}

}
