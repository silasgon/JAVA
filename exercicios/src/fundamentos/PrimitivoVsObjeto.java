package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		
		String s = new String ("Texto");
		s.toUpperCase();
		
		// Wrappers s�o a vers�o objetos dos tipos primitivos
		// Em java tudo � objeto menos os tipos primitivos
		int a = 123;
		System.out.println(a);
		
	}
}
