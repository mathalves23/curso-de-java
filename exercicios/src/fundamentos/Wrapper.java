package fundamentos;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		// byte
		Byte b = 100;
		Short s = 1000;
		System.out.println("Digite um inteiro: ");
		Integer i = Integer.parseInt(entrada.next());
		Long l = 100000L;
		
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);
		System.out.println(l/3);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		entrada.close();
		
	}
}
