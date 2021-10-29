package classe.desafio;

public class Jantar {
	public static void main(String[] args) {
		
		Comida c = new Comida("Feijão", 0.280);
		Comida c1 = new Comida("Arroz", 0.255);
		Comida c2 = new Comida("Carne", 0.320);
		
		Pessoa p = new Pessoa("Silas", 80.8);
		
		System.out.println(p.apresentar());
		p.comer(c);
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
		p.comer(c2);
		System.out.println(p.apresentar());		
	}

}
 