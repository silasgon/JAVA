package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		
		System.out.println(("" + num1).length()); //Gambiarra para convers�o de int para string
		System.out.println(("" + num2).length()); //Gambiarra para convers�o de int para string
		
	}

}
