package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
		String faixa = "amarela";
		
		switch (faixa.toLowerCase()) {
		case "preta": 
			System.out.println("Sei o Bassai-Dai");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei Heian Yodan");
		case "laranja":
			System.out.println("Sei Heian Sandan");
		case "vermelha":
			System.out.println("Sei Heian Nidan");
		case "amarela":
			System.out.println("Sei Heian Shodan");
		default:
			System.out.println("N�o sei nada \n");
		}
		
		System.out.println("Fim!\n");
		
		int idade = 1;
		switch (idade) {
		case 3:
			System.out.println("Sabe programar");
			break;
		case 2:
			System.out.println("Sabe falar");
			break;
		case 1:
			System.out.println("Sabe andar");
			break;
		case 0:
			System.out.println("Sabe respirar");
			break;
		}
	}
}
