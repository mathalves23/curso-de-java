package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (F - 32) * 5/9 = C
		final double FATOR = 5.0/9.0;
		final double AJUSTE = 32;
		
		double faren = 86;
		double celsius = (faren - AJUSTE) * FATOR;
		
		System.out.println(faren + " graus Farenheint equivalem a " + celsius + " graus celsius");
		
		 faren = 126;
		 celsius = (faren - AJUSTE) * FATOR;
		
		System.out.println(faren + " graus Farenheint equivalem a " + celsius + " graus celsius");
		
		
	}
}
