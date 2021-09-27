package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//Informações do funcionario
		
		//Tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3123845223L;
		
		//tipos numericos reais
		
		float salario = 11445.44F;
		double vendasAcumuladas = 2991797103.01;
		
		//Tipo Booleano
		boolean estaDeFerias = false;
		
		// Tipo caractere
		char status = 'A'; //Ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numeros de Viagem
		System.out.println(numerosDeVoos / 2);
		
		//Pontos por Real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}

}
