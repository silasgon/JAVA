package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Ol? Pessoal".charAt(3));
		
		String s = "Boa tarde!";
		//s = "Bom dia";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("Tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde!"));
		
		var nome = "Silas";
		var sobrenome = "Reis";
		var idade = 33;
		var salario = 1800.987;
		
		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade : " + idade + "\nSalario : " + salario;
		System.out.println(maisUmaFrase);
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade : " + idade + "\nSalario : " + salario);
		
		System.out.printf("O senhor %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase Qualquer".contains("Qual"));
		System.out.println("Frase Qualquer".indexOf("Qual"));
		System.out.println("Frase Qualquer".substring(6));
		System.out.println("Frase Qualquer".substring(6, 10));
	}

}
