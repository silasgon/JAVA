package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.ano = 2021;

		
		Data d2 = new Data(13, 10, 2021);
		//d2.dia = 06;
		//d2.mes = 10;
		//d2.ano = 2021;
		
		System.out.println(d1.obterDataFormatada());
		System.out.printf("A data de nascimento é: %d-%d-%d",d1.dia, d1.mes, d1.ano);
		System.out.printf("\nA data atual é: %d/%d/%d\n",d2.dia, d2.mes, d2.ano);
		
		d1.imprimirDataFormatada();
		
		
	}

}
