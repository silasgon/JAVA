package controle;

public class For1 {
	public static void main(String[] args) {
		
		for(int contador = 0; contador <= 20; contador ++) {
			System.out.printf("i = %d\n", contador);
		}
		
		int x = 2;
		for(;x < 10; ) {
			System.out.println("x = " + x);
			x++;
		}
		
		//La�o infinito		
		//for(;;) {
		//	System.out.println("La�o infinito");
		//}
	}

}
