package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int num1 = entrada.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int num2 = entrada.nextInt();
		
		System.out.print("Qual operação você deseja executar? ");
		String operacao = entrada.next();
		
		if (operacao.equals("+")) {
			System.out.println("O resultado da operação é: " + (num1 + num2));
		} else if (operacao.equals("-")) {
			System.out.println("O resultado da operação é: " + (num1 - num2));
		} else if (operacao.equals("*")) {
			System.out.println("O resultado da operação é: " + (num1 * num2));
		} else {
			System.out.println("O resultado da operação é: " + (num1 / num2));
		} 

		
		
		
		
		entrada.close();
		
		
	}

}
