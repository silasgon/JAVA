 package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 3.6;
		String resultadoParcial = media >= 5.0 ? "em recupera??o" : "Reprovado.";
		String resultado =  media >= 7.0 ? "Aprovado." : resultadoParcial;
		System.out.println("O aluno est? " + resultado);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado2 = temDesconto ? "Sim." : "N?o.";
		
		System.out.printf("Tem desconto? %s", resultado2);
	}

}
