package fundamentos;


class Wrappers {
	public static void main(String[] args) {

		// byte
		Byte b = 100;
		Short s = 1000;
		//Integer i = Integer.parseInt(entrada.next()); // int
		Integer i = 10000;
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 2);
		System.out.println(l * 2);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 12345.6789;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("True");
		System.out.println(bo);
		//System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //Char
		System.out.println(c + "...");

	}

}
