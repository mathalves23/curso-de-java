package fundamentos;

public class ConversaoTiposPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; // implícita
		System.out.println(a);
		
		float b = (float) 1.12345688; // explícita (CAST)
		System.out.println(b);
		
		
		int c = 4;
		byte d = (byte) c;
		
		System.out.println("c = " + c + ", d = " + d);
		
		
		
	}

}
